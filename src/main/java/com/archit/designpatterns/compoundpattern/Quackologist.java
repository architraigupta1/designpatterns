package com.archit.designpatterns.compoundpattern;

public class Quackologist implements Observer {

  @Override
  public void update(Quackable duck) {
    System.out.println("Quackable quacked: " + duck.toString());
  }
}
