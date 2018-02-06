package com.tungphan.designpatternsample.structural.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TungPhan on 1/5/18.
 */

public class FacadeDemo {

    public void usingFacade() {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }

    private static List<Integer> multipleArray = new ArrayList<>();

    public static void main(String[] args) {
        final int range = checkNumberRange(2018, 4);
        for (int i = 0; i < range; i++) {
            multipleArray.add(getMultiFrom(i, 4));
        }
    }

    private static void temp() {

    }

    private static int checkNumberRange(int number, int multiTime) {
        int result = 1;
        while (getMultiFrom(result, 4) < number) {
            result++;
        }
        return result;
    }

    private static int getMultiFrom(int number, int multiTime) {
        int result = 1;
        for (int i = 0; i < multiTime; i++) {
            result = result * number;
        }
        return result;
    }

}
