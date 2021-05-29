package com.archit.designpatterns.decorator;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    setDescription("House Blend Coffee");
  }

  @Override
  public Double getCost() {
    return 0.89;
  }
}
