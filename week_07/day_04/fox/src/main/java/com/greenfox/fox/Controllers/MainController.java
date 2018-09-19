package com.greenfox.fox.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String showIndex() {
    return "index";
  }


  @GetMapping("/login")
  public String login() {
    return "login";
  }


  @PostMapping("/save")
  public String loginWithName(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", name);
    return "index";
  }

}
