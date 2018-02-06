package com.tungphan.designpatternsample.creational.factorymethod;

/**
 * Created by TungPhan on 1/3/18.
 */

public class ConcreateCreator extends Creator {

    @Override
    protected Bike factoryMethod() {
        return new ConcreateBike();
    }

}
