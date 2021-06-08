package com.archit.designpatterns.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu<MenuItem> {

  Map<String, MenuItem> map;

  public CafeMenu() {
    this.map = new HashMap<>();
    addItem("Dinner A", "Dinner item a", 5.9);
    addItem("Dinner B", "Dinner item b", 6.5);
    addItem("Dinner C", "Dinner item c", 8.3);
  }

  @Override
  public Iterator<MenuItem> createIterator() {
    return this.map.values().iterator();
  }

  @Override
  public void addItem(String name, String description, Double price) {
    MenuItem menuItem = new MenuItem(name, description, price);
    this.map.put(name, menuItem);
  }
}
