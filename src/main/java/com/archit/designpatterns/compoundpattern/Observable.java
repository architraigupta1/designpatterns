package com.archit.designpatterns.compoundpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {

  Quackable quackable;
  List<Observer> observers;

  public Observable(Quackable quackable) {
    this.quackable = quackable;
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
      this.observers.add(observer);
  }

  @Override
  public void notifyObservers() {
    Iterator<Observer> it = this.observers.iterator();
    while (it.hasNext()) {
      Observer observer = it.next();
      observer.update(quackable);
    }
  }
}
