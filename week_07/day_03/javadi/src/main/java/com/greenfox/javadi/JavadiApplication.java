package com.greenfox.javadi;

import com.greenfox.javadi.Service.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavadiApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(JavadiApplication.class, args);
  }

  @Autowired
  Printer printer;

  @Autowired
  @Qualifier("blue")
  MyColor mycolor;

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    mycolor.printColor();
  }


}
