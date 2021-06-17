package com.archit.designpatterns.compoundpattern;

public interface QuackObservable {

  public void registerObserver(Observer observer);
  public void notifyObservers();
}
