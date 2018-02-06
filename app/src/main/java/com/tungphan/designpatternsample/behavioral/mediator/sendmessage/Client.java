package com.tungphan.designpatternsample.behavioral.mediator.sendmessage;

/**
 * Created by phant on 06-02-18.
 */

public class Client {

    public static void main(String[] args){
        ApplicationMediator mediator = new ApplicationMediator();
        ConcreateColleague desktop = new ConcreateColleague(mediator);
        MobileColluegue mobile = new MobileColluegue(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("hello world");
        mobile.send("hello");
    }
}
