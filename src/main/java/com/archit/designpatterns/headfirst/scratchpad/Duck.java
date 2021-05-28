package com.archit.designpatterns.headfirst.scratchpad;

public abstract class Duck {
  Flyable flyable;

  void swim() {
    System.out.println("swim");
  }

  void fly() {
    flyable.fly();
  }


  void setFlyable(Flyable flyable) {
    this.flyable = flyable;
  }
}
