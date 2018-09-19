package com.greenfox.javadi.Controllers;

import com.greenfox.javadi.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UtilityController {

  @Autowired
  UtilityService utilityService;


  @GetMapping("/useful")
  public String showUtilities() {
    return "utilities";
  }

  @GetMapping("/useful/colored")
  public String coloredBackground(Model model) {
    model.addAttribute("randomColor", utilityService.randomColor());
    return "coloredbackground";
  }


  @GetMapping("/useful/email")
  public String validateEmail(@RequestParam String email, Model model) {
    model.addAttribute("isValid", utilityService.validateEmail(email));
    model.addAttribute("emailAddress", email);
    return "email";
  }


}
