package com.tungphan.designpatternsample.structural.flyweight;


import android.graphics.Color;

import com.tungphan.designpatternsample.tempmodel.Graphics;

/**
 * Created by TungPhan on 1/5/18.
 */

public class Line implements Shape {

    public Line() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
        line.setColor(color);
        line.drawLine(x1, y1, x2, y2);
    }
}
