package com.tungphan.designpatternsample.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TungPhan on 1/12/18.
 */

public class Agent {

    private List<Order> orderQueue = new ArrayList<>();

    public Agent() {

    }

    public void takeOrder(Order order) {
        orderQueue.add(order);
    }

    public void placeOrders() {
        for (Order order : orderQueue) {
            order.execute();
        }
        orderQueue.clear();
    }


}
