package com.archit.designpatterns.decorator;

public class Whip extends CondimentDecorator {

  private Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public Double getCost() {
    return beverage.getCost() + 0.10;
  }
}
