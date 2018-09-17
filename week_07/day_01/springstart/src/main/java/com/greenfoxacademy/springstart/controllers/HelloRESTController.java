package com.greenfoxacademy.springstart.controllers;


import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloRESTController {
  AtomicLong idGenerator = new AtomicLong();


  @RequestMapping(value = "/greet")
  @ResponseBody
  public Greeting greet() {
    return (new Greeting(1, "Hello"));
  }

//  @RequestMapping(value = "/greeting")
//  @ResponseBody
//  public Greeting greet(@RequestParam("name") String name) {
//    return (new Greeting(1, name));
//  }

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public Greeting greet(@RequestParam("name") String name) {
    long id = idGenerator.incrementAndGet();
    return (new Greeting(id, name));
  }



}

