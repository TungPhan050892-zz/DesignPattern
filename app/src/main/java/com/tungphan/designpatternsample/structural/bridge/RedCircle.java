package com.tungphan.designpatternsample.structural.bridge;

import android.util.Log;

/**
 * Created by TungPhan on 1/4/18.
 */

public class RedCircle implements DrawAPI {

    private final String TAG = RedCircle.class.getSimpleName();

    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.e(TAG, "Draw red circle " + radius + " " + x + " " + y);
    }
}
