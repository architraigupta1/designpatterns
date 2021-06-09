package com.archit.designpatterns.iterator.refactor2;

public class MenuItem extends MenuComponent {
  private String name;
  private String description;
  private Double price;

  public MenuItem(String name, String description, Double price) {
    this.name = name;
    this.description = description;
    this.price = price;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Double getPrice() {
    return price;
  }

  public void print() {
    System.out.println("name:" + getName()
        + " description: " + getDescription()
        + " price: " + getPrice());
  }
}
