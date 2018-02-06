package com.tungphan.designpatternsample.creational.abstractfactory;

import android.util.Log;


/**
 * Created by TungPhan on 1/3/18.
 */

public class Z800 extends AbstractBikeKawasaki {

    private final String TAG = Z800.class.getSimpleName();

    public Z800(String argument) {
        Log.e(TAG, "Argument: " + argument);
    }

}
