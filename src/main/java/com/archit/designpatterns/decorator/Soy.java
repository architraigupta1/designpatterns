package com.archit.designpatterns.decorator;

public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    super(beverage);
  }


  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  @Override
  public Double getCost() {
    return beverage.getCost() + 0.15;
  }
}
