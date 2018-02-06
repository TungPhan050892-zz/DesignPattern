package com.tungphan.designpatternsample.behavioral.interpreter.numberalconverter;

/**
 * Created by phant on 02-02-18.
 */

public class HundredExpression extends Expression {

    public String one() {
        return "C";
    }

    public String four() {
        return "CD";
    }

    public String five() {
        return "D";
    }

    public String nine() {
        return "CM";
    }

    public int multiplier() {
        return 100;
    }

}
