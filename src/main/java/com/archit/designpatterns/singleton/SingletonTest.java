package com.archit.designpatterns.singleton;

public class SingletonTest {
  public static void main(String[] args) {
    Singleton firstInstance = Singleton.getInstance();
    System.out.println(firstInstance.hashCode());
    firstInstance.getLetters(2).forEach(letter -> System.out.print(letter + " "));

    Singleton secondInstance = Singleton.getInstance();
    System.out.println(secondInstance.hashCode());
    secondInstance.getLetters(3).forEach(letter -> System.out.print(letter + " "));
  }
}
