package com.tungphan.designpatternsample.singleton;

import android.util.Log;

/**
 * Created by TungPhan on 1/2/18.
 */

/**
 * Notice the private inner static class that contains the instance of the singleton class.
 * When the singleton class is loaded, SingletonHelper class is not loaded into memory and
 * only when someone calls the getInstance method, this class gets loaded and creates the Singleton
 * class instance.
 * This is the most widely used approach for Singleton class as it doesn’t require synchronization.
 * I am using this approach in many of my projects and it’s easy to understand and implement also.
 * Source: https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#eager-initialization
 **/
public class SingletonBillPugh {

    private final String TAG = SingletonBillPugh.class.getSimpleName();
    private static SingletonBillPugh instance = new SingletonBillPugh();

    private SingletonBillPugh() {

    }

    private static class SingletonHelper {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void doSommething() {
        Log.e(TAG, "doSomething");
    }

}
