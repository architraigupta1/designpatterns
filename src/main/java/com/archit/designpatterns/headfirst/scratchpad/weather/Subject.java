package com.archit.designpatterns.headfirst.scratchpad.weather;

public interface Subject {

  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();

  void setState(int temperature, int humidity, int pressure);

}
