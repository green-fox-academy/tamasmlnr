package com.greenfox.simba;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount account = new BankAccount("Simba", 2000, "Lion");

  @RequestMapping("/list")
  public String showList(Model model) {
    BankAccount account = new BankAccount("Simba", 2000, "Lion");
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("animal", account.getAnimalType());
    return "account";
  }

  @RequestMapping("/text")
  public String showText(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "text";
  }

  @RequestMapping("/list")
  public String showMultiple(Model model) {
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("animal", account.getAnimalType());
    return "account";
  }


}
