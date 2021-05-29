package com.archit.designpatterns.decorator;

public class Decaf extends Beverage {

  public Decaf() {
    setDescription("Decaf");
  }

  @Override
  public Double getCost() {
    return 1.05;
  }
}
