package com.tungphan.designpatternsample.behavioral.chainofresponsibility;

/**
 * Created by TungPhan on 1/12/18.
 */

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }

}
