package com.tungphan.designpatternsample.decorator;

import android.util.Log;

/**
 * Created by TungPhan on 1/4/18.
 */

public class Circle implements Shape {

    private final String TAG = Rectangle.class.getSimpleName();

    @Override
    public void draw() {
        Log.e(TAG, "draw circle");
    }

}
