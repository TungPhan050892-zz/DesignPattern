package com.tungphan.designpatternsample.structural.flyweight;

import android.graphics.Color;

import com.tungphan.designpatternsample.tempmodel.Graphics;

/**
 * Created by TungPhan on 1/5/18.
 */

public class DrawingClient extends JFrame {

    private final int WIDTH;
    private final int HEIGHT;
    private static final ShapeFactory.ShapeType shapes[] = {ShapeFactory.ShapeType.LINE,
            ShapeFactory.ShapeType.OVAL_FILL,
            ShapeFactory.ShapeType.OVAL_NOT_FILL};
    private static final int colors[] = {Color.RED, Color.GREEN, Color.YELLOW};

    public DrawingClient(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        Shape shape = ShapeFactory.getShape(getRandomShape());
        shape.draw(new Graphics(), getRandomX(), getRandomY(), getRandomWidth(),
                getRandomHeight(), getRandomColor());
    }

    private ShapeFactory.ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
