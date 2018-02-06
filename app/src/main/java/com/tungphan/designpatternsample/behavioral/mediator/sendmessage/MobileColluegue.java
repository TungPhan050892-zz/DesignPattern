package com.tungphan.designpatternsample.behavioral.mediator.sendmessage;

import android.util.Log;

/**
 * Created by phant on 06-02-18.
 */

public class MobileColluegue extends Colleague {

    private static final String TAG = MobileColluegue.class.getSimpleName();

    public MobileColluegue(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        Log.e(TAG,"receive");
    }
}
