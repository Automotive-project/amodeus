/* amodeus - Copyright (c) 2018, ETH Zurich, Institute for Dynamic Systems and Control */
package ch.ethz.idsc.amodeus.matsim.mod;

import org.matsim.core.controler.AbstractModule;

import ch.ethz.matsim.av.framework.AVUtils;

public class AmodeusGeneratorModule extends AbstractModule {
    @Override
    public void install() {
        bind(RandomDensityGenerator.Factory.class);
        AVUtils.bindGeneratorFactory(binder(), "RandomDensity").to(RandomDensityGenerator.Factory.class);
    }
}
