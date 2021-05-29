package com.archit.designpatterns.decorator;

public class Soy extends CondimentDecorator {

  private Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
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
