package com.greenfox.simba.Controllers;


import com.greenfox.simba.Model.BankAccount;
import com.greenfox.simba.Model.BankAccountList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

  BankAccount account = new BankAccount("Simba", 2000, "Lion", true, false);


  BankAccountList accountList = new BankAccountList();

  @RequestMapping("/list")
  public String showList(Model model) {

    BankAccount account = new BankAccount("Simba", 2000, "Lion", true, false);
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
    BankAccount newAccount = new BankAccount();
    model.addAttribute("accountList", accountList);
    model.addAttribute("newAcc", newAccount);
    return "accountlist";
  }


  @PostMapping("/donate")
  public String donate(@RequestParam String animalName) {

    accountList.getList()
        .stream()
        .filter(animal -> animal.getName()
            .equals(animalName))
        .forEach(animal -> animal.increaseAmount());
    return "redirect:/accountlist";
  }


  @PostMapping("/addaccount")
  public String addNewAccount(@ModelAttribute BankAccount newAccount) {
    System.out.println(newAccount);
    accountList.add(newAccount);
    return "redirect:/accountlist";
  }


}

