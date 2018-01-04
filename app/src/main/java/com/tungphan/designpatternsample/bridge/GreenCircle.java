package com.tungphan.designpatternsample.bridge;

import android.util.Log;

/**
 * Created by TungPhan on 1/4/18.
 */

public class GreenCircle implements DrawAPI {

    private final String TAG = GreenCircle.class.getSimpleName();

    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.e(TAG, "Draw green circle " + radius + " " + x + " " + y);
    }

}
