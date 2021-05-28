package com.archit.designpatterns.headfirst.scratchpad.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
  private int temperature;
  private int humidity;
  private int pressure;

  private List<Observer> observers;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
    System.out.println("adding observer: " + observer.getId());
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    System.out.println("removing observer: " + observer.getId());
    this.observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for(Observer observer : this.observers) {
      System.out.println("notifying observer: " + observer.getId());
      observer.update(temperature, humidity, pressure);
    }
  }

  @Override
  public void setState(int temperature, int humidity, int pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    notifyObservers();
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  public void setHumidity(int humidity) {
    this.humidity = humidity;
  }

  public void setPressure(int pressure) {
    this.pressure = pressure;
  }
}
