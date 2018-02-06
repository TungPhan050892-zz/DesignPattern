package com.tungphan.designpatternsample.creational.factory;

/**
 * Created by TungPhan on 1/2/18.
 */

public class SuperBike extends Bike {

    static {
        BikeFactory.getInstance().registerBike("SuperBike", new SuperBike());
    }

    @Override
    public SuperBike createBike() {
        return new SuperBike();
    }
}
