package com.archit.designpatterns.decorator;

public class SteamedMilk extends CondimentDecorator {

  public SteamedMilk(Beverage beverage) {
    super(beverage);
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
