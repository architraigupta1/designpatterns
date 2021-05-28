package com.archit.designpatterns.headfirst.scratchpad.weather;

public class WeatherSimulator {
  public static void main(String[] args) {
    Subject weatherData = new WeatherData();
    CurrentDisplay currentDisplay = new CurrentDisplay();
    TrendDisplay trendDisplay = new TrendDisplay();

    currentDisplay.subscribe(weatherData);
    weatherData.setState(10, 2, 5);
    currentDisplay.display();
    trendDisplay.display();

    trendDisplay.subscribe(weatherData);
    trendDisplay.display();

    weatherData.setState(5, 9, 20);
    currentDisplay.display();
    trendDisplay.display();

    currentDisplay.unsubscribe(weatherData);

    weatherData.setState(7, 8, 9);
    currentDisplay.display();
    trendDisplay.display();
  }
}
