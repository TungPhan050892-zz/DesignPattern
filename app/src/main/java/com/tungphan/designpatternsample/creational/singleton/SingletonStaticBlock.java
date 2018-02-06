package com.tungphan.designpatternsample.creational.singleton;

import android.util.Log;

/**
 * Created by TungPhan on 1/2/18.
 */

public class SingletonStaticBlock {

    private final String TAG = SingletonStaticBlock.class.getSimpleName();
    private static SingletonStaticBlock instance;

    static {
        try {
            instance = new SingletonStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    private SingletonStaticBlock() {

    }

    public static SingletonStaticBlock getInstance() {
        return instance;
    }

    public void doSommething() {
        Log.e(TAG, "doSomething");
    }
}
