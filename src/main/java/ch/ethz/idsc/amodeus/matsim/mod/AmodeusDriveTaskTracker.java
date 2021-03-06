/* amodeus - Copyright (c) 2018, ETH Zurich, Institute for Dynamic Systems and Control */
package ch.ethz.idsc.amodeus.matsim.mod;

import java.util.Objects;

import org.matsim.api.core.v01.network.Link;
import org.matsim.contrib.dvrp.data.Vehicle;
import org.matsim.contrib.dvrp.optimizer.VrpOptimizerWithOnlineTracking;
import org.matsim.contrib.dvrp.path.DivertedVrpPath;
import org.matsim.contrib.dvrp.path.VrpPath;
import org.matsim.contrib.dvrp.path.VrpPathWithTravelData;
import org.matsim.contrib.dvrp.schedule.DriveTask;
import org.matsim.contrib.dvrp.tracker.OnlineDriveTaskTracker;
import org.matsim.contrib.dvrp.util.LinkTimePair;
import org.matsim.contrib.dvrp.vrpagent.VrpLeg;
import org.matsim.core.mobsim.framework.MobsimTimer;

import ch.ethz.idsc.amodeus.util.math.GlobalAssert;

public class AmodeusDriveTaskTracker implements OnlineDriveTaskTracker {
    public static final boolean DEBUG = false;
    // ---
    private final Vehicle vehicle;
    private final DriveTask driveTask;
    private final VrpLeg vrpDynLeg;

    private final VrpOptimizerWithOnlineTracking optimizer;
    private final MobsimTimer timer;

    private VrpPath path;
    private int currentLinkIdx;
    private double linkEnterTime;
    private double[] remainingTTs;// excluding the current link

    AmodeusDriveTaskTracker(Vehicle vehicle, VrpLeg vrpDynLeg, VrpOptimizerWithOnlineTracking optimizer, MobsimTimer timer) {
        this.vehicle = vehicle;
        this.driveTask = (DriveTask) vehicle.getSchedule().getCurrentTask();
        this.vrpDynLeg = vrpDynLeg;
        this.optimizer = optimizer;
        this.timer = timer;

        initForPath(driveTask.getPath());
        currentLinkIdx = 0;
        linkEnterTime = driveTask.getBeginTime();
    }

    private void initForPath(VrpPath path) {
        this.path = path;
        remainingTTs = new double[path.getLinkCount()];

        double tt = 0;
        for (int i = remainingTTs.length - 1; i >= 0; i--) {
            remainingTTs[i] = tt;
            tt += path.getLinkTravelTime(i);
        }
    }

    @Override
    public void movedOverNode(Link nextLink) {
        currentLinkIdx++;
        linkEnterTime = timer.getTimeOfDay();
        optimizer.vehicleEnteredNextLink(vehicle, nextLink);
    }

    /** Assumption: vehicle is diverted as soon as possible, i.e.:
     * <ul>
     * <li>if the next link can be changed: after the current link</li>
     * <li>If not then, (a) if the current link is not the last one, after the
     * next link, or</li>
     * <li>(b) no diversion possible (the leg ends on the current link)</li>
     * </ul>
     */
    @Override
    public LinkTimePair getDiversionPoint() {
        if (vrpDynLeg.canChangeNextLink()) {
            return new LinkTimePair(path.getLink(currentLinkIdx), predictLinkExitTime());
        }

        if (path.getLinkCount() == currentLinkIdx + 1) {// the current link is
                                                        // the last one
            return null;// too late to divert (reason: cannot change the next
                        // link)
        }

        double nextLinkTT = path.getLinkTravelTime(currentLinkIdx + 1);
        double predictedNextLinkExitTime = predictLinkExitTime() + nextLinkTT;
        return new LinkTimePair(path.getLink(currentLinkIdx + 1), predictedNextLinkExitTime);
    }

    /** @author Claudio Ruch
     * @return */
    public LinkTimePair getSafeDiversionPoint() {
        if (getDiversionPoint() != null)
            return getDiversionPoint();
        return getPathEndDiversionPoint();
    }

    /** @author Claudio Ruch
     * @return diversion point at end of path */
    private LinkTimePair getPathEndDiversionPoint() {
        LinkTimePair returnPair = new LinkTimePair(path.getToLink(), predictLinkExitTime());
        GlobalAssert.that(Objects.nonNull(returnPair));
        return returnPair;
    }

    @Override
    public void divertPath(VrpPathWithTravelData newSubPath) {
        LinkTimePair diversionPoint = getSafeDiversionPoint();
        GlobalAssert.that(Objects.nonNull(newSubPath));
        GlobalAssert.that(Objects.nonNull(diversionPoint));
        GlobalAssert.that(Objects.nonNull(newSubPath.getFromLink()));
        GlobalAssert.that(Objects.nonNull(diversionPoint.link));

        if (!newSubPath.getFromLink().equals(diversionPoint.link)) {
            throw new IllegalArgumentException("links dont match: " + newSubPath.getFromLink().getId() + "!=" + diversionPoint.link.getId());
        }
        if (newSubPath.getDepartureTime() != diversionPoint.time) {
            throw new IllegalArgumentException("times dont match");
        }

        int diversionLinkIdx = getDiversionLinkIndex();

        DivertedVrpPath divertedPath = new DivertedVrpPath(path, newSubPath, diversionLinkIdx);

        initForPath(divertedPath);

        vrpDynLeg.pathDiverted(divertedPath);
        driveTask.pathDiverted(divertedPath, newSubPath.getArrivalTime());

    }

    @Override
    public double predictEndTime() {
        return predictLinkExitTime() + remainingTTs[currentLinkIdx];
    }

    private double predictLinkExitTime() {
        return Math.max(timer.getTimeOfDay(), linkEnterTime + path.getLinkTravelTime(currentLinkIdx));
    }

    public int getCurrentLinkIdx() {
        return currentLinkIdx;
    }

    public int getDiversionLinkIndex() {
        return getCurrentLinkIdx() + (vrpDynLeg.canChangeNextLink() ? 0 : 1);
    }
}
