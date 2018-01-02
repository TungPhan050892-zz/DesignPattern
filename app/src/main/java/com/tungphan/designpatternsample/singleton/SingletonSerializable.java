package com.tungphan.designpatternsample.singleton;


import java.io.Serializable;

/**
 * Created by TungPhan on 1/2/18.
 */

public class SingletonSerializable implements Serializable {

    private final String TAG = SingletonSerializable.class.getSimpleName();
    private static SingletonSerializable instance;

    private SingletonSerializable() {

    }

    private static class SingletonHelper {
        private static final SingletonSerializable INSTANCE = new SingletonSerializable();
    }

    public static SingletonSerializable getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
