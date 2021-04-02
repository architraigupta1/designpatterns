package com.archit.designpatterns.factory;

public class GameContoller {

  public static void main(String[] args) {
    EnemyFactory factory = new EnemyFactory();
    EnemyShip theEnemy = factory.createEnemyShip("U");

    theEnemy.printName();
    theEnemy.makeDamage();

    theEnemy = factory.createEnemyShip("R");

    theEnemy.printName();
    theEnemy.makeDamage();
  }
}
