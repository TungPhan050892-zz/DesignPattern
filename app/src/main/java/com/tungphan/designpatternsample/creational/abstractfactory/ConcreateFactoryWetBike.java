package com.tungphan.designpatternsample.creational.abstractfactory;

/**
 * Created by TungPhan on 1/3/18.
 */

public class ConcreateFactoryWetBike extends AbstractFactory {

    @Override
    AbstractBikeDucati createBikeDucati() {
        return new Scrambler("Scrambler");
    }

    @Override
    AbstractBikeKawasaki createBikeKawasaki() {
        return new Z800("Z800");
    }

}
