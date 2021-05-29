package com.archit.designpatterns.decorator;

public abstract class Beverage {
  private Size size = Size.TALL;
  private String description = "Unknown beverage";

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

  public Size getSize() {
    return size;
  }

  public void setSize(Size size) {
    this.size = size;
  }

  public abstract Double getCost();
}
