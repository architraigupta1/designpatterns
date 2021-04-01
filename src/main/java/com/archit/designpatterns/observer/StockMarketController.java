package com.archit.designpatterns.observer;

public class StockMarketController {
  public static void main(String[] args) {
    StockGrabber stockGrabber = new StockGrabber();
    AllStocksObserver allOne = new AllStocksObserver(stockGrabber);

    stockGrabber.setAaplPrice(100);
    stockGrabber.setGoogPrice(250);

    AllStocksObserver allTwo = new AllStocksObserver(stockGrabber);
    IbmStockObserver ibmOne = new IbmStockObserver(stockGrabber);
    stockGrabber.setAaplPrice(200);

    stockGrabber.unregister(allOne);

    stockGrabber.setIbmPrice(500);

    allOne.printPrices();

    stockGrabber.register(allOne);
    stockGrabber.setIbmPrice(550);
    allOne.printPrices();
  }
}
