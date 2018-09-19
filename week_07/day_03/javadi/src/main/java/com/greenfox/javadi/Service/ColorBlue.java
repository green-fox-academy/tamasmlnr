package com.greenfox.javadi.Service;

import com.greenfox.javadi.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")


public class ColorBlue implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("It is blue in color..");
  }
}
