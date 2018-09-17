package com.greenfoxacademy.springstart;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
  @RequestMapping(value="/hello")
  @ResponseBody
  public String hello() {
    return "Hello!";
  }

}

