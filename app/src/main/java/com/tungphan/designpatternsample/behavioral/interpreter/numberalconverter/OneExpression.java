package com.tungphan.designpatternsample.behavioral.interpreter.numberalconverter;

/**
 * Created by phant on 02-02-18.
 */

public class OneExpression extends Expression {

    public String one() {
        return "I";
    }

    public String four() {
        return "IV";
    }

    public String five() {
        return "V";
    }

    public String nine() {
        return "IX";
    }

    public int multiplier() {
        return 1;
    }

}
