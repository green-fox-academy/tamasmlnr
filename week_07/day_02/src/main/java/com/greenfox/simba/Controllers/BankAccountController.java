package com.greenfox.simba.Controllers;


import com.greenfox.simba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

  BankAccount account = new BankAccount("Simba", 2000, "Lion", true);

  List<BankAccount> accountList = Arrays.asList(
      new BankAccount("Simba", 1000, "Lion", true),
      new BankAccount("Mufasa", 2500, "Lion", true),
      new BankAccount("Scar", 3000, "Lion", false),
      new BankAccount("Timon", 1500, "Meerkat", true),
      new BankAccount("Pumba", 1500, "Boar", true)
  );


  @RequestMapping("/list")
  public String showList(Model model) {
    BankAccount account = new BankAccount("Simba", 2000, "Lion", true);
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

  @RequestMapping("/accountlist")
  public String showMultiple(Model model) {
    String name = "";
    accountList.stream()
        .filter(account -> account.getName() == "Mufasa")
        .forEach(p -> p.makeKing());

    model.addAttribute("accountList", accountList);
    model.addAttribute("name", name);
    return "accountlist";
  }


  @PostMapping("/accountlist")
  public String donate(@RequestParam String animalName) {
    accountList.stream()
        .filter(animal -> animal.getName()
            .equals(animalName))
        .forEach(animal -> animal.increaseAmount());
    return "redirect:/accountlist";
  }
}

