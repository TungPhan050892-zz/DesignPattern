package com.tungphan.designpatternsample.behavioral.mediator.chat;

/**
 * Created by phant on 06-02-18.
 */

public abstract class User {

    protected ChatMediator mediator;
    private String name;

    public User(ChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

}
