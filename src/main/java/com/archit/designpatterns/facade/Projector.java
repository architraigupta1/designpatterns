package com.archit.designpatterns.facade;

public class Projector {

  private ProjectorInput input;

  public void on() {
    System.out.println("Projector turned on");
  }

  public void off() {
    System.out.println("Projector turned off");
  }

  public void setInput(ProjectorInput input) {
    this.input = input;
  }
}
