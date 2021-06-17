package com.archit.designpatterns.compoundpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {

  private List<Quackable> quackables;

  public Flock() {
    this.quackables = new ArrayList<>();
  }

  public void add(Quackable quackable) {
    this.quackables.add(quackable);
  }

  @Override
  public void quack() {
    Iterator<Quackable> it = this.quackables.iterator();
    while(it.hasNext()) {
      Quackable quackable = it.next();
      quackable.quack();
    }
  }

  @Override
  public void registerObserver(Observer observer) {
    Iterator<Quackable> it = this.quackables.iterator();
    while (it.hasNext()) {
      Quackable quackable = it.next();
      quackable.registerObserver(observer);
    }
  }

  @Override
  public void notifyObservers() {

  }
}
