package com.archit.designpatterns.headfirst.scratchpad.weather;

public interface Observer {

  String getId();
  void update(int temperature, int humidity, int pressure);
}
