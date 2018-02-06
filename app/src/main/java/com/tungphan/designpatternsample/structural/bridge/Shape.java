package com.tungphan.designpatternsample.structural.bridge;

/**
 * Created by TungPhan on 1/4/18.
 */

public abstract class Shape {

    DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
