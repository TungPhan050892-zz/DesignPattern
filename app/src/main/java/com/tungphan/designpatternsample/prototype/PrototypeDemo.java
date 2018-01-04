package com.tungphan.designpatternsample.prototype;

import android.util.Log;

/**
 * Created by TungPhan on 1/3/18.
 */

public class PrototypeDemo {

    private final String TAG = PrototypeDemo.class.getSimpleName();

    public void usePrototype() {
        ShapeCache.loadCache();
        Shape cloneShape = (Shape) ShapeCache.getShape("1");
        Log.e(TAG, "SHAPE: " + cloneShape.getType());
        Circle cloneCircle = (Circle) ShapeCache.getShape("2");
        Log.e(TAG, "SHAPE: " + cloneCircle.getType());
        Rectangle cloneRectangle = (Rectangle) ShapeCache.getShape("3");
        Log.e(TAG, "SHAPE: " + cloneRectangle.getType());
    }
}
