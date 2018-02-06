package com.tungphan.designpatternsample.behavioral.command;

/**
 * Created by TungPhan on 1/12/18.
 */

public class BuyStockOrder implements Order {

    private StockTrade stockTrade;

    public BuyStockOrder(StockTrade stockTrade) {
        this.stockTrade = stockTrade;
    }

    @Override
    public void execute() {
        stockTrade.buy();
    }

}
