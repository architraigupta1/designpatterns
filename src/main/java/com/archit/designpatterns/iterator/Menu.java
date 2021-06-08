package com.archit.designpatterns.iterator;

import java.util.Iterator;

public interface Menu<E> {
  Iterator<E> createIterator();

  void addItem(String name, String description, Double price);
}
