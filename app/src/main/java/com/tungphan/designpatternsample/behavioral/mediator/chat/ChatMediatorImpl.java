package com.tungphan.designpatternsample.behavioral.mediator.chat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by phant on 06-02-18.
 */

public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User originalUser) {
        for (User user : users) {
            if (user != originalUser) {
                user.send(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

}
