package com.archit.designpatterns.facade;

public class Amplifier {

  int volume;

  public void on() {
    System.out.println("Amplifier turned on");
  }

  public void off() {
    System.out.println("Amplifier turned off");
  }

  public void setVolume(int volume) {
    this.volume = volume;
    System.out.println("Amplifier volume set to : " + this.volume);
  }
}
