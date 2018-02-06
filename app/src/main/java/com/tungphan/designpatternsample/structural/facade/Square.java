package com.tungphan.designpatternsample.structural.facade;

import android.util.Log;

/**
 * Created by TungPhan on 1/5/18.
 */

public class Square implements Shape {

    private final String TAG = Circle.class.getSimpleName();

    @Override
    public void draw() {
        Log.e(TAG, "Rectangle");
    }

}
