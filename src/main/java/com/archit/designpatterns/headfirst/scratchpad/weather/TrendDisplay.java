package com.archit.designpatterns.headfirst.scratchpad.weather;

public class TrendDisplay implements Observer, Display {

  private String id;
  private int temperature;
  private int humidity;


  public TrendDisplay() {
    this.id = "trend_display";
  }

  public void unsubscribe(Subject subject) {
    subject.removeObserver(this);
  }

  public void subscribe(Subject subject) {
    subject.registerObserver(this);
  }

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void update(int temperature, int humidity, int pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
  }

  public void display() {
    System.out.println("Temperature: " + this.temperature
        + ", humidity: " + this.humidity);
  }
}
