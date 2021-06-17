package com.archit.designpatterns.compoundpattern;

public class DuckCall implements Quackable {

  Observable observable;

  public DuckCall() {
    this.observable = new Observable(this);
  }

  @Override
  public void quack() {
    System.out.println("Kwak");
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
    return "Hunter's fake duck toy";
  }
}
