package com.tungphan.designpatternsample.behavioral.command;

/**
 * Created by TungPhan on 1/12/18.
 */

public class CommandDemo {

    public void usingCommand(){
        StockTrade stockTrade = new StockTrade();
        BuyStockOrder buyStockOrder = new BuyStockOrder(stockTrade);
        SellStockOrder sellStockOrder = new SellStockOrder(stockTrade);
        Agent agent = new Agent();
        agent.takeOrder(buyStockOrder);
        agent.takeOrder(sellStockOrder);
        agent.placeOrders();
    }
}
