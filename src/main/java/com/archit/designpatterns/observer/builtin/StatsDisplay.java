package com.archit.designpatterns.observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class StatsDisplay implements Observer, DisplayElement {

  private int temperature;
  private int humidity;
  private int pressure;
  private WeatherData weatherData;

  public StatsDisplay(Observable weatherData) {
    this.weatherData = (WeatherData) weatherData;
    weatherData.addObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Temperature: " + this.temperature
        + " Humidity: " + this.humidity
        + " Pressure: " + this.pressure);
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      this.pressure = weatherData.getPressure();
      display();
    }
  }
}
