package com.greenfoxacademy.springstart.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@Controller


public class HelloEntireWorldController {

  public int randomInt() {
    return (int) (Math.random() * 255);
  }

  public double randomFontSize() {
    return Math.random() * 20 + 15;
  }

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  public String randomHello() {
    return hellos[(int) (Math.random() * ((hellos.length) - 1))];
  }


  @RequestMapping("/web/helloall")
  public String helloWorld(Model model) {
    model.addAttribute("fontSize", Math.random() * 20 + 15);
    model.addAttribute("red", randomInt());
    model.addAttribute("green", randomInt());
    model.addAttribute("blue", randomInt());
    model.addAttribute("hello", randomHello());
    return "helloall";
  }

}
