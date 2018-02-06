package com.tungphan.designpatternsample.behavioral.mediator.chat;

import android.util.Log;

/**
 * Created by phant on 06-02-18.
 */

public class UserImpl extends User {

    private static final String TAG = UserImpl.class.getSimpleName();

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        Log.e(TAG, "send");
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        Log.e(TAG, "receive" + msg);
    }
}
