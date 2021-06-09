package com.archit.designpatterns.iterator.refactor2;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
  private String name;
  private String description;
  private List<MenuComponent> menuComponents;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
    this.menuComponents = new ArrayList<>();
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
  public void addComponent(MenuComponent menuComponent) {
    this.menuComponents.add(menuComponent);
  }

  public void print() {
    System.out.println("name:" + getName()
        + " description: " + getDescription());
    for (MenuComponent menuComponent : this.menuComponents) {
      menuComponent.print();
    }
  }

}
