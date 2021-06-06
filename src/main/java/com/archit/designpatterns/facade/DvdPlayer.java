package com.archit.designpatterns.facade;

public class DvdPlayer implements ProjectorInput {

  String cd;

  public void on() {
    System.out.println("DvdPlayer turned on");
  }

  public void off() {
    System.out.println("DvdPlayer turned off");
  }

  public void setCD(String cd) {
    this.cd = cd;
    System.out.println("DvdPlayer set to play : " + this.cd);
  }

  public void play() {
    System.out.println("Playing movie : " + this.cd);
  }
}
