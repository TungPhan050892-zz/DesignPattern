package com.tungphan.designpatternsample.behavioral.interpreter.rulevalidator;

/**
 * Created by phant on 02-02-18.
 */

public class AndExpression extends Expression {

    private Expression expressionOne = null;
    private Expression expressionTwo = null;

    public AndExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    public boolean interpret(String str){
        return expressionOne.interpret(str) && expressionTwo.interpret(str);
    }
}
