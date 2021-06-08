package com.archit.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeMenu implements Menu<MenuItem> {

  List<MenuItem> menuItems;

  public PancakeMenu() {
    this.menuItems = new ArrayList<>();
    addItem("Breakfast A", "Breakfast item a", 15.0);
    addItem("Breakfast B", "Breakfast item b", 2.5);
    addItem("Breakfast C", "Breakfast item c", 3.3);
  }

  @Override
  public void addItem(String name, String description, Double price) {
    MenuItem menuItem = new MenuItem(name, description, price);
    this.menuItems.add(menuItem);
  }

  @Override
  public Iterator<MenuItem> createIterator() {
    return this.menuItems.iterator();
  }
}
