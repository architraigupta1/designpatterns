package com.archit.designpatterns.decorator;

public abstract class CondimentDecorator extends Beverage {

  Beverage beverage;
  public abstract String getDescription();

  public CondimentDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  public Size getSize() {
    return beverage.getSize();
  }
}
