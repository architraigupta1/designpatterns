package com.archit.designpatterns.observer;

public class IbmStockObserver implements Observer{

  private String observerId;
  private double ibmPrice;
  private StockGrabber stockGrabber;

  private static int observerCounter = 1;

  public IbmStockObserver(StockGrabber stockGrabber) {
    this.observerId = "Ibm_observer_" + observerCounter++;
    this.stockGrabber = stockGrabber;
    this.stockGrabber.register(this);
  }

  @Override
  public void update(double ibmPrice, double aaplPrice, double googPrice) {
    this.ibmPrice = ibmPrice;
    printPrices();
  }

  @Override
  public void printPrices() {
    System.out.println("\n" + "\nObserver ID: " + this.observerId
        + "\nIbm price: " + this.ibmPrice + "\n");
  }

  @Override
  public String getId() {
    return this.observerId;
  }
}
