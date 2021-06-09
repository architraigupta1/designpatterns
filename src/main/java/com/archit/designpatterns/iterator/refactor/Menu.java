package com.archit.designpatterns.iterator.refactor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {
  List<MenuItem> menuItemList;
  List<Menu> submenu;

  public Menu() {
    this.menuItemList = new ArrayList<>();
    this.submenu = new ArrayList<>();
  }

  public void addMenuItem(String name, String description, Double price) {
    MenuItem menuItem = new MenuItem(name, description, price);
    this.menuItemList.add(menuItem);
  }

  public void addSubMenu(Menu submenu) {
    this.submenu.add(submenu);
  }

  public Iterator<MenuItem> createMenuItemIterator() {
    return this.menuItemList.iterator();
  }

  public boolean hasMenuItems() {
    return !this.menuItemList.isEmpty();
  }

  public boolean hasSubmenu() {
    return !this.submenu.isEmpty();
  }
}
