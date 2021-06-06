package com.archit.designpatterns.facade;

public class Tuner {

  int frequency;

  public void on() {
    System.out.println("Tuner turned on");
  }

  public void off() {
    System.out.println("Tuner turned off");
  }

  public void setAm() {
    System.out.println("Tuner turned to AM mode");
  }

  public void setFm() {
    System.out.println("Tuner turned to FM mode");
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
    System.out.println("Tuner frequency set to : " + this.frequency);
  }
}
