package com.greenfox.postmanager.Controller;


import com.greenfox.postmanager.Model.Post;
import com.greenfox.postmanager.Service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PostController {

  PostService postService;

  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String showPosts(Model model) {
    model.addAttribute("posts", postService.getAllPosts());
    return "posts";
  }

  @GetMapping("/addpost")
  public String addPost() {
    return "addpost";
  }

  @PostMapping("/savepost")
  public String savePost(@RequestParam("content") String content) {
    postService.addPost(content);
    return "redirect:/";
  }

  @GetMapping("/delete/{id}")
  public String deletePost(@PathVariable String id) {
    postService.deletePost(postService.getPostById(Long.decode(id)));
    return "redirect:/";
  }

}
