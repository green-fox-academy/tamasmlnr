package com.greenfox.groot.Controller;


import com.greenfox.groot.Models.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Object groot(@RequestBody(required = false) Message message) {

    return null;
  }


}
