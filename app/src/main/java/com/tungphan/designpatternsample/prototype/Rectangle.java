package com.tungphan.designpatternsample.prototype;

import android.util.Log;

/**
 * Created by TungPhan on 1/3/18.
 */

public class Rectangle extends Shape {

    private final String TAG = Rectangle.class.getSimpleName();

    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw() {
        Log.e(TAG, "inside rectangle");
    }
}
