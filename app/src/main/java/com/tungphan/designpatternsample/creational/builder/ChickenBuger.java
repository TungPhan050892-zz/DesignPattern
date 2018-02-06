package com.tungphan.designpatternsample.creational.builder;

/**
 * Created by TungPhan on 1/3/18.
 */

public class ChickenBuger extends Buger {


    @Override
    public String name() {
        return "Chicken Buger";
    }

    @Override
    public float price() {
        return 50.5f;
    }

}
