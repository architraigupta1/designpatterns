package com.archit.designpatterns.strategy;

public class AeroPlane extends Vehicle {

  public AeroPlane(String name) {
    super("AeroPlane");
    setName(name);
    setFly(new CanFly());
  }
}
