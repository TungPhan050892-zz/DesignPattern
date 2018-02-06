package com.tungphan.designpatternsample.creational.abstractfactory;

import android.util.Log;

/**
 * Created by TungPhan on 1/3/18.
 */

public class Z1000 extends AbstractBikeKawasaki{

    private final String TAG = Z1000.class.getSimpleName();

    public Z1000(String argument) {
        Log.e(TAG, "Argument: " + argument);
    }

}
