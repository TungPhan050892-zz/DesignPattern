package com.tungphan.designpatternsample.behavioral.chainofresponsibility;

/**
 * Created by TungPhan on 1/12/18.
 */

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }

}
