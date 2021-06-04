package com.archit.designpatterns.command;

public class Fan {

  public static int OFF = 0;
  public static int LOW = 1;
  public static int MEDIUM = 2;
  public static int HIGH = 3;
  int speed;
  String name;

  public Fan(String name) {
    this.name = name;
    this.speed = OFF;
  }

  public void low() {
    this.speed = LOW;
    System.out.println(name + " Fan speed low");
  }

  public void medium() {
    this.speed = MEDIUM;
    System.out.println(name + " Fan speed medium");
  }

  public void high() {
    this.speed = HIGH;
    System.out.println(name + " Fan speed high");
  }

  public void off() {
    this.speed = OFF;
    System.out.println(name + " Fan off");
  }

  public int getSpeed() {
    return this.speed;
  }
}
