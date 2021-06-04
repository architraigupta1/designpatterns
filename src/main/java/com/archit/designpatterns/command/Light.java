package com.archit.designpatterns.command;

public class Light {

  String name;

  public Light(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println(this.name + " Light on");
  }

  public void off() {
    System.out.println(this.name + " Light off");
  }
}
