package com.archit.designpatterns.command;

public class Stereo {

  public void off() {
    System.out.println("Stereo off");
  }

  public void on() {
    System.out.println("Stereo on");
  }

  public void setCD() {
    System.out.println("Stereo CD Set");
  }

  public void setVolume(int volume) {
    System.out.println("Stereo volume set to " + volume);
  }

}
