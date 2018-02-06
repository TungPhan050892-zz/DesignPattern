package com.tungphan.designpatternsample.behavioral.mediator.chat;

/**
 * Created by phant on 06-02-18.
 */

public interface ChatMediator {

    void sendMessage(String msg, User user);

    void addUser(User user);
}
