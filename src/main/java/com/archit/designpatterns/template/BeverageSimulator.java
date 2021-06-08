package com.archit.designpatterns.template;

public class BeverageSimulator {
  public static void main(String[] args) {
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    tea.prepare();
    coffee.prepare();
  }
}
