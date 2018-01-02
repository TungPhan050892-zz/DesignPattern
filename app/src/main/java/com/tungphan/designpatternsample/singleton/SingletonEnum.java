package com.tungphan.designpatternsample.singleton;

import android.util.Log;

/**
 * Created by TungPhan on 1/2/18.
 */

public enum SingletonEnum {

    INSTANCE;

    public static void doSommething() {
        Log.e("SingletonEnum", "doSomething");
    }

}
