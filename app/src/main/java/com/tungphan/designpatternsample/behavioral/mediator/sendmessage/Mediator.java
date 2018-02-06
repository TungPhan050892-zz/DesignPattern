package com.tungphan.designpatternsample.behavioral.mediator.sendmessage;

/**
 * Created by phant on 06-02-18.
 */

public interface Mediator {

    void send(String message, Colleague colleague);

}
