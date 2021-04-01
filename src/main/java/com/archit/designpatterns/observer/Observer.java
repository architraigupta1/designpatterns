package com.archit.designpatterns.observer;

public interface Observer {

  public void update(double ibmPrice, double aaplPrice, double googPrice);

  public void printPrices();

  public String getId();
}
