package com.tungphan.designpatternsample.structural.bridge;

/**
 * Created by TungPhan on 1/4/18.
 */

public class Circle extends Shape {

    private int x;
    private int y;
    private int radius;

    public Circle(int radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(x, y, radius);
    }

}
