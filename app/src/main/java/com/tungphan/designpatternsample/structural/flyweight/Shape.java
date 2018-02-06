package com.tungphan.designpatternsample.structural.flyweight;


import android.graphics.Color;

import com.tungphan.designpatternsample.tempmodel.Graphics;

/**
 * Created by TungPhan on 1/5/18.
 */

public interface Shape {

    void draw(Graphics g, int x, int y, int width, int height,
              Color color);

}
