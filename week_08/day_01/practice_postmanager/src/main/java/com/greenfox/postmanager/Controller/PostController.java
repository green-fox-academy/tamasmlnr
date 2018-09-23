package com.greenfox.postmanager.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

  @GetMapping("/")
  public String showPosts() {
    return "posts";
  }

}
