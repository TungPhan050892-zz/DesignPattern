package com.tungphan.designpatternsample.structural.flyweight;


import android.graphics.Color;

import com.tungphan.designpatternsample.tempmodel.Graphics;

/**
 * Created by TungPhan on 1/5/18.
 */

public class Oval implements Shape {

    private boolean fill;

    public Oval(boolean fill) {
        this.fill = fill;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        if (fill) {
            circle.fillOval(x, y, width, height);
        }
    }
}
