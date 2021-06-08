package com.archit.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waiter {
  List<Menu<MenuItem>> menus;

  public Waiter() {
    this.menus = new ArrayList<>();
  }

  public void addMenu(Menu menu) {
    this.menus.add(menu);
  }

  public void printMenu() {
    for (Menu<MenuItem> menu : this.menus) {
      System.out.println("\n\n~~~~~~~~~menu~~~~~~~~~~~~");
      printMenu(menu.createIterator());
    }
  }

  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.println("name:" + menuItem.getName()
          + " description: " + menuItem.getDescription()
          + " price: " + menuItem.getPrice());
    }
  }
}
