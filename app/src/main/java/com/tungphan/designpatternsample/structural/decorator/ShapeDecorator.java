package com.tungphan.designpatternsample.structural.decorator;

/**
 * Created by TungPhan on 1/4/18.
 */

public abstract class ShapeDecorator implements Shape {

    Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
