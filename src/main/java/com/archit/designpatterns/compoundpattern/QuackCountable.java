package com.archit.designpatterns.compoundpattern;

public class QuackCountable implements Quackable {

  private Quackable duck;
  private static int count = 0;

  public QuackCountable(Quackable duck) {
    this.duck = duck;
  }

  @Override
  public void quack() {
    this.duck.quack();
    count++;
  }

  public static int getCount() {
    return count;
  }

  @Override
  public void registerObserver(Observer observer) {
    duck.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    duck.notifyObservers();
  }
}
