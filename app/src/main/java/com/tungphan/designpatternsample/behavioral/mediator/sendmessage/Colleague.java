package com.tungphan.designpatternsample.behavioral.mediator.sendmessage;

/**
 * Created by phant on 06-02-18.
 */

public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);

}
