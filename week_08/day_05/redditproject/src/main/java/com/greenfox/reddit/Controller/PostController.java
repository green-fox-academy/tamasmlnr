package com.greenfox.reddit.Controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

  @GetMapping("/")
  public String showPosts() {
    return "index";
  }
}
