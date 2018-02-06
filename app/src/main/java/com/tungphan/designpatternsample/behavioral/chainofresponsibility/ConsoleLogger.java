package com.tungphan.designpatternsample.behavioral.chainofresponsibility;

/**
 * Created by TungPhan on 1/12/18.
 */

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }

}
