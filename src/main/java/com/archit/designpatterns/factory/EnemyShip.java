package com.archit.designpatterns.factory;

public abstract class EnemyShip {

  private String name;
  private int damage;

  public EnemyShip(String name, int damage) {
    this.name = name;
    this.damage = damage;
  }

  public void printName() {
    System.out.println("Enemy ship name: " + this.name);
  }

  public void makeDamage() {
    System.out.println("Enemy ship causes damage of " + this.damage);
  }
}
