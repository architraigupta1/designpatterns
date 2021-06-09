package com.archit.designpatterns.iterator.refactor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waiter {

  List<Menu> menus;

  public Waiter() {
    this.menus = new ArrayList<>();
  }

  public void addMenu(Menu menu) {
    this.menus.add(menu);
  }

  public void printMenu() {
    for(Menu menu : this.menus) {
      if (menu.hasMenuItems()) {
        printMenu(menu.createMenuItemIterator());
      }
      if (menu.hasSubmenu()) {
        printMenu(menu.submenu);
      }
    }
  }

  public void printMenu(List<Menu> submenu) {
    for(Menu menu : submenu) {
      if (menu.hasMenuItems()) {
        printMenu(menu.createMenuItemIterator());
      }
      if (menu.hasSubmenu()) {
        printMenu(menu.submenu);
      }
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
