package com.archit.designpatterns.template;

public class Tea extends CaffeineBeverage {

  @Override
  void brew() {
    System.out.println("Steep tea in boiling water");
  }

  @Override
  void addCondiments() {
    System.out.println("Add lemon to tea");
  }
}
