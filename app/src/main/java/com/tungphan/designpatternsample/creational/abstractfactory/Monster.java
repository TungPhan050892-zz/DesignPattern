package com.tungphan.designpatternsample.creational.abstractfactory;

import android.util.Log;

/**
 * Created by TungPhan on 1/3/18.
 */

public class Monster extends AbstractBikeDucati{

    private final String TAG = Monster.class.getSimpleName();

    public Monster(String argument) {
        Log.e(TAG, "Argument: " + argument);
    }

    public void fastRide(){

    }

    public void wetRide(){

    }
}
