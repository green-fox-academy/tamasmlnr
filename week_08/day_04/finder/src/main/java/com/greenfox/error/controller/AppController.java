package com.greenfox.error.controller;

import com.greenfox.error.service.UserService;
import com.greenfox.error.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

  @Autowired
  UserService service;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("new_user", new User());
    model.addAttribute("allUsers", service.getAll());
    return "main";
  }

  @PostMapping("/app")
  public String create(@ModelAttribute("new_user") User user) {
    service.save(user);
    return "redirect:/";
  }
}