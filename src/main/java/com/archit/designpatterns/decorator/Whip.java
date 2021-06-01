package com.archit.designpatterns.decorator;

public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    super(beverage);
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
