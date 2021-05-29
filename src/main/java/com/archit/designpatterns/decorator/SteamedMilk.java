package com.archit.designpatterns.decorator;

public class SteamedMilk extends CondimentDecorator {

  private Beverage beverage;

  public SteamedMilk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Steamed Milk";
  }

  @Override
  public Double getCost() {
    return beverage.getCost() + 0.10;
  }
}
