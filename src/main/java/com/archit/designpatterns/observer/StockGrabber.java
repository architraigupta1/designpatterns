package com.archit.designpatterns.observer;


import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

  private double ibmPrice;
  private double aaplPrice;
  private double googPrice;
  List<Observer> observers;

  public StockGrabber() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void register(Observer newObserver) {
    this.observers.add(newObserver);
  }

  @Override
  public void unregister(Observer deleteObserver) {
    int observerIndex = this.observers.indexOf(deleteObserver);
    this.observers.remove(observerIndex);
    System.out.println("Deleted observer: " + deleteObserver.getId());
  }

  @Override
  public void notifyObserver() {
    for (Observer observer : this.observers) {
      observer.update(ibmPrice, aaplPrice, googPrice);
    }
  }

  public void setIbmPrice(double ibmPrice) {
    this.ibmPrice = ibmPrice;
    notifyObserver();
  }

  public void setAaplPrice(double aaplPrice) {
    this.aaplPrice = aaplPrice;
    notifyObserver();
  }

  public void setGoogPrice(double googPrice) {
    this.googPrice = googPrice;
    notifyObserver();
  }
}
