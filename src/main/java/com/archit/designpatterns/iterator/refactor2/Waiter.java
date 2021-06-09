package com.archit.designpatterns.iterator.refactor2;

public class Waiter {
  MenuComponent allMenus;

  public Waiter(MenuComponent allMenus) {
    this.allMenus = allMenus;
  }

  public void print() {
    this.allMenus.print();
  }
}
