package com.tungphan.designpatternsample.structural.facade;

/**
 * Created by TungPhan on 1/5/18.
 */

public class ShapeFacade {

    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
