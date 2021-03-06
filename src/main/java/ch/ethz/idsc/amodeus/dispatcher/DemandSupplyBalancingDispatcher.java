/* amodeus - Copyright (c) 2018, ETH Zurich, Institute for Dynamic Systems and Control */
package ch.ethz.idsc.amodeus.dispatcher;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.matsim.api.core.v01.Coord;
import org.matsim.api.core.v01.network.Network;
import org.matsim.core.api.experimental.events.EventsManager;
import org.matsim.core.config.Config;
import org.matsim.core.network.NetworkUtils;
import org.matsim.core.router.util.TravelTime;
import org.matsim.core.utils.collections.QuadTree;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import ch.ethz.idsc.amodeus.dispatcher.core.RoboTaxi;
import ch.ethz.idsc.amodeus.dispatcher.core.UniversalDispatcher;
import ch.ethz.idsc.amodeus.matsim.SafeConfig;
import ch.ethz.idsc.amodeus.util.math.GlobalAssert;
import ch.ethz.matsim.av.config.AVDispatcherConfig;
import ch.ethz.matsim.av.dispatcher.AVDispatcher;
import ch.ethz.matsim.av.framework.AVModule;
import ch.ethz.matsim.av.passenger.AVRequest;
import ch.ethz.matsim.av.plcpc.ParallelLeastCostPathCalculator;

/** Implementation of the "demand-supply-balancing" dispatching heurist presented in
 * Maciejewski, Michal, and Joschka Bischoff. "Large-scale microscopic simulation of taxi services."
 * Procedia Computer Science 52 (2015): 358-364. */
public class DemandSupplyBalancingDispatcher extends UniversalDispatcher {

    private final int dispatchPeriod;
    private final double[] networkBounds;
    private final QuadTree<AVRequest> pendingRequestsTree;
    // two data structures are used to enable fast "contains" searching
    private final Set<AVRequest> openRequests = new HashSet<>();
    private final QuadTree<RoboTaxi> unassignedVehiclesTree;
    // two data structures are used to enable fast "contains" searching
    private final Set<RoboTaxi> unassignedVehicles = new HashSet<>();

    private DemandSupplyBalancingDispatcher( //
            Config config, //
            AVDispatcherConfig avDispatcherConfig, //
            TravelTime travelTime, //
            ParallelLeastCostPathCalculator parallelLeastCostPathCalculator, //
            EventsManager eventsManager, //
            Network network) {
        super(config, avDispatcherConfig, travelTime, parallelLeastCostPathCalculator, eventsManager);
        SafeConfig safeConfig = SafeConfig.wrap(avDispatcherConfig);
        dispatchPeriod = safeConfig.getInteger("dispatchPeriod", 10);
        networkBounds = NetworkUtils.getBoundingBox(network.getNodes().values());
        pendingRequestsTree = new QuadTree<>(networkBounds[0], networkBounds[1], networkBounds[2], networkBounds[3]);
        unassignedVehiclesTree = new QuadTree<>(networkBounds[0], networkBounds[1], networkBounds[2], networkBounds[3]);
    }

    @Override
    public void redispatch(double now) {
        final long round_now = Math.round(now);

        if (round_now % dispatchPeriod == 0) {

            // get open requests and available vehicles
            Collection<RoboTaxi> robotaxisDivertable = getDivertableUnassignedRoboTaxis();
            addUnassignedVehicles(getDivertableUnassignedRoboTaxis());

            List<AVRequest> requests = getUnassignedAVRequests();
            addOpenRequests(requests);

            boolean oversupply = false;
            if (unassignedVehicles.size() >= requests.size())
                oversupply = true;

            boolean canMatch = unassignedVehicles.size() > 0 && requests.size() > 0;

            if (canMatch) {
                if (oversupply) { // OVERSUPPLY CASE
                    for (AVRequest avr : requests) {
                        RoboTaxi closestRobotaxi = findClosestVehicle(avr);
                        if (closestRobotaxi != null) {
                            setRoboTaxiPickup(closestRobotaxi, avr);
                            removeFromTrees(closestRobotaxi, avr);
                        }
                    }
                } else { // UNDERSUPPLY CASE
                    for (RoboTaxi robotaxi : robotaxisDivertable) {

                        AVRequest closestReq = findClosestRequest(robotaxi);
                        if (closestReq != null) {
                            setRoboTaxiPickup(robotaxi, closestReq);
                            removeFromTrees(robotaxi, closestReq);
                        }
                    }
                }
            }
        }
    }

    private boolean removeFromTrees(RoboTaxi robotaxi, AVRequest avRequest) {
        // remove avRequest
        boolean succRM = openRequests.remove(avRequest);
        boolean succRT = pendingRequestsTree.remove(avRequest.getFromLink().getFromNode().getCoord().getX(), avRequest.getFromLink().getFromNode().getCoord().getY(), avRequest);
        boolean removeSuccessR = succRT && succRM;
        GlobalAssert.that(removeSuccessR);

        // remove robotaxi
        boolean succVM = unassignedVehicles.remove(robotaxi);
        boolean succVT = unassignedVehiclesTree.remove(robotaxi.getDivertableLocation().getCoord().getX(), robotaxi.getDivertableLocation().getCoord().getY(), robotaxi);
        boolean removeSuccessV = succVT && succVM;
        GlobalAssert.that(removeSuccessV);

        return removeSuccessR && removeSuccessV;
    }

    /** @param avRequest
     * @return the RoboTaxi closest to the given request */
    private RoboTaxi findClosestVehicle(AVRequest avRequest) {
        Coord requestCoord = avRequest.getFromLink().getCoord();
        // System.out.println("treesize " + unassignedVehiclesTree.size());
        return unassignedVehiclesTree.getClosest(requestCoord.getX(), requestCoord.getY());
    }

    /** ensures that new unassignedVehicles are added to a list with all unassigned vehicles
     * 
     * @param roboTaxis */
    private void addUnassignedVehicles(Collection<RoboTaxi> roboTaxis) {
        for (RoboTaxi roboTaxi : roboTaxis) {
            if (!unassignedVehicles.contains(roboTaxi)) {
                Coord toMatchVehicleCoord = roboTaxi.getDivertableLocation().getCoord();
                boolean uaSucc = unassignedVehicles.add(roboTaxi);
                boolean qtSucc = unassignedVehiclesTree.put( //
                        toMatchVehicleCoord.getX(), //
                        toMatchVehicleCoord.getY(), //
                        roboTaxi);
                GlobalAssert.that(uaSucc && qtSucc);
            }
        }
    }

    /** @param robotaxi
     * @return the closest Request to robotaxi found with tree-search */
    private AVRequest findClosestRequest(RoboTaxi robotaxi) {
        Coord vehicleCoord = robotaxi.getDivertableLocation().getFromNode().getCoord();
        return pendingRequestsTree.getClosest(vehicleCoord.getX(), vehicleCoord.getY());
    }

    /** ensures that new open requests are added to a list with all open requests
     * 
     * @param avRequests */
    private void addOpenRequests(Collection<AVRequest> avRequests) {
        for (AVRequest avRequest : avRequests) {
            if (!openRequests.contains(avRequest)) {
                Coord toMatchRequestCoord = avRequest.getFromLink().getFromNode().getCoord();
                boolean orSucc = openRequests.add(avRequest);
                boolean qtSucc = pendingRequestsTree.put( //
                        toMatchRequestCoord.getX(), //
                        toMatchRequestCoord.getY(), //
                        avRequest);
                GlobalAssert.that(orSucc && qtSucc);
            }
        }
    }

    public static class Factory implements AVDispatcherFactory {
        @Inject
        @Named(AVModule.AV_MODE)
        private ParallelLeastCostPathCalculator router;

        @Inject
        @Named(AVModule.AV_MODE)
        private TravelTime travelTime;

        @Inject
        private EventsManager eventsManager;

        @Inject
        @Named(AVModule.AV_MODE)
        private Network network;

        @Inject
        private Config config;

        @Override
        public AVDispatcher createDispatcher(AVDispatcherConfig avconfig) {
            return new DemandSupplyBalancingDispatcher(config, //
                    avconfig, travelTime, router, eventsManager, network);
        }
    }
}