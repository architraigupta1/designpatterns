package com.archit.designpatterns.decorator.javaapi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStreamTest {
  public static void main(String[] args) {
    try {
      InputStream in = new LowerCaseInputStream(
          new BufferedInputStream(
              new FileInputStream("src/main/resources/test.txt")
          )
      );
      int c;
      while((c = in.read()) >= 0) {
        System.out.print((char) c);
      }

      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
