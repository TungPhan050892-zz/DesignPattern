package com.tungphan.designpatternsample.behavioral.interpreter.rulevalidator;

import java.util.StringTokenizer;

/**
 * Created by phant on 02-02-18.
 */

public class TerminalExpression extends Expression {

    private String literal = null;

    public TerminalExpression(String str) {
        literal = str;
    }

    public boolean interpret(String str)
    {
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            String test = st.nextToken();
            if(test.equals(literal)){
                return true;
            }
        }
        return false;
    }
}
