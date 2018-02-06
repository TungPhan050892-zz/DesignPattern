package com.tungphan.designpatternsample.creational.singleton;

import android.util.Log;

/**
 * Created by TungPhan on 1/2/18.
 */

public class SingletonClassic {

    private final String TAG = SingletonClassic.class.getSimpleName();
    private static SingletonClassic instance;

    private SingletonClassic(){

    }

    public static SingletonClassic getInstance(){
        if(instance == null){
            instance = new SingletonClassic();
        }
        return instance;
    }

    public void doSomething(){
        Log.e(TAG, "doSomething");
    }
}
