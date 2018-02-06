package com.tungphan.designpatternsample.creational.prototype;

import android.util.Log;

/**
 * Created by TungPhan on 1/3/18.
 */

public class Circle extends Shape {

    private final String TAG = Circle.class.getSimpleName();

    public Circle() {
        type = "Square";
    }

    @Override
    public void draw() {
        Log.e(TAG, "inside Circle");
    }

}
