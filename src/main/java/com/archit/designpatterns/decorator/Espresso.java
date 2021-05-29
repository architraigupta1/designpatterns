package com.archit.designpatterns.decorator;

public class Espresso extends Beverage {

  public Espresso() {
    setDescription("Espresso");
  }

  @Override
  public Double getCost() {
    return 1.99;
  }
}
