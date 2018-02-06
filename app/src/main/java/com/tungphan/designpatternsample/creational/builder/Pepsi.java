package com.tungphan.designpatternsample.creational.builder;

/**
 * Created by TungPhan on 1/3/18.
 */

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }

}
