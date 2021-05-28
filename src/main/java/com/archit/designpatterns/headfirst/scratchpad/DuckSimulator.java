package com.archit.designpatterns.headfirst.scratchpad;

public class DuckSimulator {
  public static void main(String[] args) {
    Duck duck = new RedDuck();
    duck.setFlyable(new FlyHigh());
    duck.fly();
    duck.swim();

  }
}
