package com.archit.designpatterns.observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class CurrentDisplay implements Observer, DisplayElement {

  private int temperature;
  private int humidity;
  private WeatherData weatherData;

  public CurrentDisplay(Observable weatherData) {
    this.weatherData = (WeatherData) weatherData;
    this.weatherData.addObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Temperature: " + this.temperature
    + " Humidity: " + this.humidity);
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }
}
