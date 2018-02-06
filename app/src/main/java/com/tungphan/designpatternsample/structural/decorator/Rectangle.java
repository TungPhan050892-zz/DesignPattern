package com.tungphan.designpatternsample.structural.decorator;

import android.util.Log;

/**
 * Created by TungPhan on 1/4/18.
 */

public class Rectangle implements Shape {

    private final String TAG = Rectangle.class.getSimpleName();

    @Override
    public void draw() {
        Log.e(TAG, "draw Rectangle");
    }

}

