package com.tungphan.designpatternsample.creational.factory;

import java.util.HashMap;

/**
 * Created by TungPhan on 1/2/18.
 */

public class BikeFactory {

    private final String TAG = BikeFactory.class.getSimpleName();
    private HashMap<String, Bike> registeredBike = new HashMap();

    private BikeFactory() {

    }

    public static BikeFactory getInstance() {
        return BikeSingletonHelper.INSTANCE;
    }

    public void registerBike(String bikeID, Bike bike) {
        registeredBike.put(bikeID, bike);
    }

    public void createBike(String bikeId) {
        registeredBike.get(bikeId).createBike();
    }

    private static class BikeSingletonHelper {
        private static final BikeFactory INSTANCE = new BikeFactory();
    }

}
