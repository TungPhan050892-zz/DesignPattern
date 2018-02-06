package com.tungphan.designpatternsample.structural.flyweight;

import java.util.HashMap;

/**
 * Created by TungPhan on 1/5/18.
 */

public class ShapeFactory {

    public enum ShapeType {
        OVAL_FILL, OVAL_NOT_FILL, LINE;
    }

    private static final HashMap<ShapeType, Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);
        if (shapeImpl == null) {
            switch (type) {
                case OVAL_FILL:
                    shapeImpl = new Oval(true);
                    break;
                case OVAL_NOT_FILL:
                    shapeImpl = new Oval(false);
                    break;
                case LINE:
                    shapeImpl = new Line();
                    break;
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }
}
