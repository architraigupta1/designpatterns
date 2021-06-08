package com.archit.designpatterns.template;

public class Coffee extends CaffeineBeverage {


  @Override
  public boolean userWantsCondiments() {
    return false;
  }

  @Override
  void brew() {
    System.out.println("Brew coffee seeds in boiling water");
  }

  @Override
  void addCondiments() {
    System.out.println("Add Milk and Sugar");
  }
}
