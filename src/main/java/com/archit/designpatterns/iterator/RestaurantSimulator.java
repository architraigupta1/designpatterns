package com.archit.designpatterns.iterator;

public class RestaurantSimulator {
  public static void main(String[] args) {
    PancakeMenu pancakeMenu = new PancakeMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    Waiter waiter = new Waiter();
    waiter.addMenu(pancakeMenu);
    waiter.addMenu(dinerMenu);
    waiter.addMenu(cafeMenu);
    waiter.printMenu();
  }
}
