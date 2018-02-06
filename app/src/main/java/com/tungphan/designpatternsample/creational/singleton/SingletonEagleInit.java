package com.tungphan.designpatternsample.creational.singleton;

import android.util.Log;

/**
 * Created by TungPhan on 1/2/18.
 */

public class SingletonEagleInit {

    private final String TAG = SingletonEagleInit.class.getSimpleName();
    private static SingletonEagleInit instance = new SingletonEagleInit();

    private SingletonEagleInit(){

    }

    public static SingletonEagleInit getInstance(){
        return instance;
    }

    public void doSommething(){
        Log.e(TAG, "doSomething");
    }

}
