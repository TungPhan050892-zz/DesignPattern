package com.tungphan.designpatternsample.behavioral.command;

/**
 * Created by TungPhan on 1/12/18.
 */

public class SellStockOrder implements Order {

    private StockTrade stockTrade;
    public SellStockOrder ( StockTrade stockTrade) {
        stockTrade = stockTrade;
    }

    @Override
    public void execute() {
        stockTrade.sell( );
    }
}
