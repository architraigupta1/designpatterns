package com.archit.designpatterns.observer.builtin;

public class WeatherSimulator {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
    StatsDisplay statsDisplay = new StatsDisplay(weatherData);

    weatherData.setState(10, 20, 30);

    weatherData.setState(5, 10, 20);

    weatherData.setState(9, 8, 7);
  }
}
