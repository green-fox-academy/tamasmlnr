package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloCounterWebController {
  AtomicLong visitCounter = new AtomicLong();

  @RequestMapping("/web/greeting_count")
  public String greet(@RequestParam("name") String name, Model model) {
    long visitNumber = visitCounter.incrementAndGet();
    model.addAttribute("name", name);
    model.addAttribute("timesOpened", visitNumber);
    return "greet";
  }

}
