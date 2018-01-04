package com.tungphan.designpatternsample.factorymethod;

/**
 * Created by TungPhan on 1/3/18.
 */

public abstract class Creator {

    public void anOperation() {
        Bike bike = factoryMethod();
    }

    protected abstract Bike factoryMethod();

}
