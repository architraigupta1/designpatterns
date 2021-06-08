package com.archit.designpatterns.template;

public abstract class CaffeineBeverage {
  void prepare() {
    boilWater();
    brew();
    pourInCup();
    if (userWantsCondiments()) {
      addCondiments();
    }
  }

  void boilWater() {
    System.out.println("Boiling water");
  }

  void pourInCup() {
    System.out.println("Pour drink in a cup");
  }

  boolean userWantsCondiments() {
    return true;
  }

  abstract void brew();

  abstract void addCondiments();


}
