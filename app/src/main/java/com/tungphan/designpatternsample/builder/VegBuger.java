package com.tungphan.designpatternsample.builder;

/**
 * Created by TungPhan on 1/3/18.
 */

public class VegBuger extends Buger{

    @Override
    public String name() {
        return "Veg Buger";
    }

    @Override
    public float price() {
        return 25.0f;
    }

}
