package com.tungphan.designpatternsample.behavioral.interpreter.rulevalidator;

/**
 * Created by phant on 02-02-18.
 */

public class MainInterprer {

    static Expression buildInterpreterTree()
    {
        // Literal
        Expression terminal1 = new TerminalExpression("John");
        Expression terminal2 = new TerminalExpression("Henry");
        Expression terminal3 = new TerminalExpression("Mary");
        Expression terminal4 = new TerminalExpression("Owen");
        // Henry or Mary
        Expression alternation1 = new OrExpression(terminal2, terminal3);
        // John or (Henry or Mary)
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        // Owen and (John or (Henry or Mary))
        return new AndExpression(terminal4, alternation2);
    }


    /**
     * main method - build the interpreter
     *  and then interpret a specific sequence
     * @param args
     */
    public static void main(String[] args) {
        String context = "Mary Owen";
        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }

}
