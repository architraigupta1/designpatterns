package com.archit.designpatterns.compoundpattern;

public class RedHeadedDuck implements Quackable {

  Observable observable;

  public RedHeadedDuck() {
    this.observable = new Observable(this);
  }

  @Override
  public void quack() {
    System.out.println("Quack");
    notifyObservers();
  }

  @Override
  public void registerObserver(Observer observer) {
    this.observable.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    this.observable.notifyObservers();
  }

  @Override
  public String toString() {
    return "Red Headed duck";
  }
}
