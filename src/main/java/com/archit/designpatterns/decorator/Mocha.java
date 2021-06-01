package com.archit.designpatterns.decorator;

public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public Double getCost() {
    Double cost = beverage.getCost();
    if (beverage.getSize() == Size.TALL) {
      return cost + 0.10;
    } else if (beverage.getSize() == Size.GRANDE) {
      return cost + 0.15;
    } else {
      return cost + 0.20;
    }
  }
}
