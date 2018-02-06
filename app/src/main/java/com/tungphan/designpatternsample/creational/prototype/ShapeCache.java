package com.tungphan.designpatternsample.creational.prototype;

import java.util.Hashtable;

/**
 * Created by TungPhan on 1/3/18.
 */

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeID) {
        Shape cachedShape = shapeMap.get(shapeID);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setID("1");
        shapeMap.put(circle.getID(),circle);
        Square square = new Square();
        square.setID("2");
        shapeMap.put(square.getID(),square);
        Rectangle rectangle = new Rectangle();
        rectangle.setID("3");
        shapeMap.put(rectangle.getID(),rectangle);
    }
}
