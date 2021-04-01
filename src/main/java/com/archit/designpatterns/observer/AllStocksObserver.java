package com.archit.designpatterns.observer;

public class AllStocksObserver implements Observer{

  private String observerId;
  private double ibmPrice;
  private double aaplPrice;
  private double googPrice;
  private StockGrabber stockGrabber;

  private static int observerCounter = 1;

  public AllStocksObserver(StockGrabber stockGrabber) {
    this.observerId = "all_stock_observer_" + observerCounter++;
    this.stockGrabber = stockGrabber;
    this.stockGrabber.register(this);
  }

  @Override
  public void update(double ibmPrice, double aaplPrice, double googPrice) {
      this.ibmPrice = ibmPrice;
      this.aaplPrice = aaplPrice;
      this.googPrice = googPrice;

    printPrices();
  }

  @Override
  public void printPrices() {
    System.out.println("\n" + "\nObserver ID: " + this.observerId
        + "\nIbm price: " + this.ibmPrice
        + "\nApple price: " + this.aaplPrice
        + "\nGoogle price:" + this.googPrice + "\n");
  }

  @Override
  public String getId() {
    return this.observerId;
  }

}
