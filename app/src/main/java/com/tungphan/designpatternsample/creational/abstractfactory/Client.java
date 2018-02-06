package com.tungphan.designpatternsample.creational.abstractfactory;

/**
 * Created by TungPhan on 1/3/18.
 */

public class Client {

    public void usingFactory(){
        AbstractFactory af = FactoryMaker.getFactory("FastBike");
        AbstractBikeDucati abd = af.createBikeDucati();
        abd.fastRide();
    }

}
