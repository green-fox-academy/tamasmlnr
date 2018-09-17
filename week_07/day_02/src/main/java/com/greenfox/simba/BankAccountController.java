package com.greenfox.simba;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount account = new BankAccount("Simba", 2000, "Lion");

  @RequestMapping("/list")
  public String showList(Model model) {
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("animal", account.getAnimalType());
  return "account";
  }

}
