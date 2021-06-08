package com.archit.designpatterns.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu<MenuItem> {

  final private int MAX_ITEMS = 6;
  MenuItem[] menuItems;
  int position;

  public DinerMenu() {
    this.menuItems = new MenuItem[MAX_ITEMS];
    this.position = 0;
    addItem("Lunch A", "lunch item a", 5.0);
    addItem("Lunch B", "lunch item b", 2.0);
    addItem("Lunch C", "lunch item c", 3.0);
  }

  public void addItem(String name, String description, Double price) {
    MenuItem menuItem = new MenuItem(name, description, price);
    if (this.position >= MAX_ITEMS) {
      System.out.println("Menu already full");
    } else {
      menuItems[this.position] = menuItem;
      this.position++;
    }
  }

  @Override
  public Iterator<MenuItem> createIterator() {
    return new DinerMenuIterator(this.menuItems);
  }
}
