package com.archit.designpatterns.decorator;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    setDescription("Dar Roast");
  }

  @Override
  public Double getCost() {
    return 0.99;
  }
}
