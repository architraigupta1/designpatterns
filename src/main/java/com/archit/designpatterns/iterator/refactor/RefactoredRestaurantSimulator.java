package com.archit.designpatterns.iterator.refactor;

public class RefactoredRestaurantSimulator {
  public static void main(String[] args) {
    Menu breakfastMenu = new Menu();
    breakfastMenu.addMenuItem("Breakfast A", "Breakfast item a", 15.0);
    breakfastMenu.addMenuItem("Breakfast B", "Breakfast item b", 2.5);
    breakfastMenu.addMenuItem("Breakfast C", "Breakfast item c", 3.3);

    Menu lunchMenu = new Menu();
    lunchMenu.addMenuItem("Lunch A", "lunch item a", 5.0);
    lunchMenu.addMenuItem("Lunch B", "lunch item b", 2.0);
    lunchMenu.addMenuItem("Lunch C", "lunch item c", 3.0);

    Menu dessertMenu = new Menu();
    dessertMenu.addMenuItem("Dessert A", "Dessert item a", 5.0);
    dessertMenu.addMenuItem("Dessert B", "Dessert item b", 2.0);
    dessertMenu.addMenuItem("Dessert C", "Dessert item c", 3.0);

    lunchMenu.addSubMenu(dessertMenu);

    Menu dinnerMenu = new Menu();
    dinnerMenu.addMenuItem("Dinner A", "Dinner item a", 5.9);
    dinnerMenu.addMenuItem("Dinner B", "Dinner item b", 6.5);
    dinnerMenu.addMenuItem("Dinner C", "Dinner item c", 8.3);

    Waiter waiter = new Waiter();
    waiter.addMenu(breakfastMenu);
    waiter.addMenu(lunchMenu);
    waiter.addMenu(dinnerMenu);
    waiter.printMenu();

  }
}
