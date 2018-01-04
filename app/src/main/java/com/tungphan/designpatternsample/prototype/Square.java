package com.tungphan.designpatternsample.prototype;

import android.util.Log;

/**
 * Created by TungPhan on 1/3/18.
 */

public class Square extends Shape {

    private final String TAG = Square.class.getSimpleName();

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        Log.e(TAG, "inside Square");
    }

}
