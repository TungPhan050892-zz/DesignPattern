package com.tungphan.designpatternsample.structural.decorator;

import android.util.Log;

/**
 * Created by TungPhan on 1/4/18.
 */

public class RedShapeDecorator extends ShapeDecorator {

    private final String TAG = RedShapeDecorator.class.getSimpleName();

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        Log.e(TAG, "set red border");
    }

}
