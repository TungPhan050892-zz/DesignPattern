package com.tungphan.designpatternsample.abstractfactory;

/**
 * Created by TungPhan on 1/3/18.
 */

public class ConcreateFactoryFastBike extends AbstractFactory {

    @Override
    AbstractBikeDucati createBikeDucati() {
        return new Monster("Monster");
    }

    @Override
    AbstractBikeKawasaki createBikeKawasaki() {
        return new Z1000("Z1000");
    }

}
