package com.archit.designpatterns.facade;

public class TheaterLights {
  public void on() {
    System.out.println("Theater Lights turned on");
  }

  public void off() {
    System.out.println("Theater Lights turned off");
  }

  public void dim() {
    System.out.println("Theater Lights dimmed");
  }
}
