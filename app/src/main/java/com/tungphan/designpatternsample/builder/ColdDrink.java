package com.tungphan.designpatternsample.builder;

/**
 * Created by TungPhan on 1/3/18.
 */

public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
