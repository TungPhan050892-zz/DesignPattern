package com.tungphan.designpatternsample.creational.singleton;

import android.util.Log;

/**
 * Created by TungPhan on 1/2/18.
 */

public class SingletonLazyLoad {

    private final String TAG = SingletonLazyLoad.class.getSimpleName();
    private static SingletonLazyLoad instance;

    private SingletonLazyLoad(){

    }

    public static SingletonLazyLoad getInstance(){
        if (instance == null) {
            synchronized (SingletonLazyLoad.class){
                if(instance == null){
                    instance = new SingletonLazyLoad();
                }
            }
        }
        return instance;
    }

    public void doSomething(){
        Log.e(TAG, "doSomething");
    }
}
