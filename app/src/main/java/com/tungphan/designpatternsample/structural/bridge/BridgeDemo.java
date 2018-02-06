package com.tungphan.designpatternsample.structural.bridge;

/**
 * Created by TungPhan on 1/4/18.
 */

public class BridgeDemo {

    public void usingBridge(){
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }

}
