package com.archit.designpatterns.iterator.refactor2;

public class RefactoredRestaurantSimulatorv2 {
  public static void main(String[] args) {
    MenuComponent allMenus = new Menu("All Menus", "All menus");
    MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Breakfast");
    MenuComponent lunchMenu = new Menu("Lunch Menu", "Lunch");
    MenuComponent dinnerMenu = new Menu("Dinner Menu", "Dinner");
    MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert");

    allMenus.addComponent(breakfastMenu);
    allMenus.addComponent(lunchMenu);
    allMenus.addComponent(dinnerMenu);

    Waiter waiter = new Waiter(allMenus);

    breakfastMenu.addComponent(new MenuItem("Breakfast A", "Breakfast item a", 15.0));
    breakfastMenu.addComponent(new MenuItem("Breakfast B", "Breakfast item b", 2.5));
    breakfastMenu.addComponent(new MenuItem("Breakfast C", "Breakfast item c", 3.3));

    lunchMenu.addComponent(new MenuItem("Lunch A", "lunch item a", 5.0));
    lunchMenu.addComponent(new MenuItem("Lunch B", "lunch item b", 2.0));
    lunchMenu.addComponent(new MenuItem("Lunch C", "lunch item c", 3.0));

    dessertMenu.addComponent(new MenuItem("Dessert A", "Dessert item a", 5.0));
    dessertMenu.addComponent(new MenuItem("Dessert B", "Dessert item b", 2.0));
    dessertMenu.addComponent(new MenuItem("Dessert C", "Dessert item c", 3.0));

    dinnerMenu.addComponent(new MenuItem("Dinner A", "Dinner item a", 5.9));
    dinnerMenu.addComponent(new MenuItem("Dinner B", "Dinner item b", 6.5));
    dinnerMenu.addComponent(new MenuItem("Dinner C", "Dinner item c", 8.3));

    lunchMenu.addComponent(dessertMenu);

    waiter.print();
  }
}
