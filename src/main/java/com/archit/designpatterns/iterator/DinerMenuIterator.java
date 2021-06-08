package com.archit.designpatterns.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

  MenuItem[] menuItems;
  int position;

  public DinerMenuIterator(MenuItem[] menuItems) {
    this.menuItems = menuItems;
    this.position = 0;
  }

  @Override
  public boolean hasNext() {
    return position < menuItems.length && menuItems[position] != null;
  }

  @Override
  public MenuItem next() {
    MenuItem menuItem = menuItems[position];
    position++;
    return menuItem;
  }
}
