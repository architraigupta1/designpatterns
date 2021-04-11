package com.archit.designpatterns.singleton;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
  private static Singleton instance = null;

  private String[] letterBox = new String[] {"a", "b", "c", "d", "e", "f", "g", "h"};
  private LinkedList<String> letters;

  private Singleton() {

  }

  public static Singleton getInstance() {
    if (instance != null) {
      return instance;
    }

    synchronized (Singleton.class) {
      if(instance == null) {
        instance = new Singleton();
        instance.letters = new LinkedList<String>(Arrays.asList(instance.letterBox));
        Collections.shuffle(instance.letters);
      }
    }

    return instance;
  }

  public LinkedList<String> getLetters(int numberOfLetters) {
    LinkedList<String> result = new LinkedList<>();
    for (int i = 0; i < numberOfLetters; i++) {
      result.add(instance.letters.remove(0));
    }

    return result;
  }
}
