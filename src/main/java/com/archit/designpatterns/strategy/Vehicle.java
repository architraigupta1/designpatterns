package com.archit.designpatterns.strategy;

public class Vehicle {
  private String type;
  private String name;
  private Integer numberOfWheels;
  private Fly fly;

  public void setFly(Fly fly) {
    this.fly = fly;
  }

  public void tryToFly() {
    this.fly.tryFly();
  }

  public Vehicle(String type) {
    this.type = type;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setNumberOfWheels(Integer numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public void getSpecifications() {
    System.out.println("I am a " + type + " and my name is " + name);
  }
}
