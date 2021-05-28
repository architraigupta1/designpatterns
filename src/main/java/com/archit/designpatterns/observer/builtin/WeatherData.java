package com.archit.designpatterns.observer.builtin;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
  private int temperature;
  private int humidity;
  private int pressure;
  private List<Observer> observers;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  public void setState(int temperature, int humidity, int pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    setChanged();
    notifyObservers();
  }

  public int getTemperature() {
    return temperature;
  }

  public int getHumidity() {
    return humidity;
  }

  public int getPressure() {
    return pressure;
  }
}
