package com.tungphan.designpatternsample.builder;

/**
 * Created by TungPhan on 1/3/18.
 */

public abstract class Buger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
