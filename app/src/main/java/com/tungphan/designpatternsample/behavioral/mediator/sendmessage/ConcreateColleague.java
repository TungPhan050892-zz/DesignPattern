package com.tungphan.designpatternsample.behavioral.mediator.sendmessage;

import android.util.Log;

/**
 * Created by phant on 06-02-18.
 */

public class ConcreateColleague extends Colleague {

    private static final String TAG = ConcreateColleague.class.getSimpleName();

    public ConcreateColleague(Mediator mediator) {
        super(mediator);
    }

    public void receive(String message){
        Log.e(TAG, "receive");
    }

}
