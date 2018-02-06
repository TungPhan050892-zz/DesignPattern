package com.tungphan.designpatternsample.creational.abstractfactory;

/**
 * Created by TungPhan on 1/3/18.
 */

public class FactoryMaker {

    public static AbstractFactory factory = null;

    static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("FastBike")){
            factory = new ConcreateFactoryFastBike();
        }else if(choice.equalsIgnoreCase("WetBike")){
            factory = new ConcreateFactoryWetBike();
        }
        return factory;
    }
}
