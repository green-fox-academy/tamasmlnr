package com.greenfox.javadi.Service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class ColorRed implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is red in color..");
  }
}
