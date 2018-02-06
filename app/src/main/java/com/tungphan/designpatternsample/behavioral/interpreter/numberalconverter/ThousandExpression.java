package com.tungphan.designpatternsample.behavioral.interpreter.numberalconverter;

/**
 * Created by phant on 02-02-18.
 */

public class ThousandExpression extends Expression {

    public String one() {
        return "M";
    }

    public String four() {
        return " ";
    }

    public String five() {
        return " ";
    }

    public String nine() {
        return " ";
    }

    public int multiplier() {
        return 1000;
    }

}
