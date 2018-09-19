package com.greenfox.javadi.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UtilityController {

  @GetMapping("/useful")
  public String showUtilities() {
    return "utilities";
  }

  @GetMapping("/useful/colored")
  public String coloredBackground() {
    return "coloredBackground";
  }


}
