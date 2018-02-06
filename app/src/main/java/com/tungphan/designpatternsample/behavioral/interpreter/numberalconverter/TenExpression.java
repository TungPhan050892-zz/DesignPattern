package com.tungphan.designpatternsample.behavioral.interpreter.numberalconverter;

/**
 * Created by phant on 02-02-18.
 */

public class TenExpression extends Expression {

    public String one() {
        return "X";
    }

    public String four() {
        return "XL";
    }

    public String five() {
        return "L";
    }

    public String nine() {
        return "XC";
    }

    public int multiplier() {
        return 10;
    }

}
