package com.tungphan.designpatternsample.structural.decorator;

/**
 * Created by TungPhan on 1/4/18.
 */

public class DecorationDemo {

    public void usingDecoration(){
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        circle.draw();
        redCircle.draw();
        redRectangle.draw();

    }
}
