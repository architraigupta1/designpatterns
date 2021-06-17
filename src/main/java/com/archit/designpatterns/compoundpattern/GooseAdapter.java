package com.archit.designpatterns.compoundpattern;

public class GooseAdapter implements Quackable {

  Goose goose;
  Observable observable;

  public GooseAdapter(Goose goose) {
    this.goose = goose;
    this.observable = new Observable(this);
  }

  @Override
  public void quack() {
    goose.honk();
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
    return "Goose hidden as duck";
  }
}
