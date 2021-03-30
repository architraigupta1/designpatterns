package com.archit.designpatterns.strategy;

public class Car extends Vehicle {

  public Car(String name) {
    super("Car");
    setName(name);
    setFly(new CannotFly());
  }
}
