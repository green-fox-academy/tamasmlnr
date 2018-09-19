package com.greenfox.javadi.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxController {

  @GetMapping("/gfa")
  public String gfaMain() {
    return "studentlist";
  }


}
