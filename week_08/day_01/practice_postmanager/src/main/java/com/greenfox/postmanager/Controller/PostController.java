package com.greenfox.postmanager.Controller;


import com.greenfox.postmanager.Model.Post;
import com.greenfox.postmanager.Service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

  PostService postService;

  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String showPosts() {
    return "posts";
  }

  @GetMapping("/addpost")
  public String addPost() {
    return "addpost";
  }

  @PostMapping("/savepost")
  public String savePost(@RequestParam("content") Post post) {

    return "posts";
  }

}
