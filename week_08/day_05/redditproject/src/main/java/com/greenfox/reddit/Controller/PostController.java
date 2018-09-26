package com.greenfox.reddit.Controller;

import com.greenfox.reddit.Models.Post;
import com.greenfox.reddit.Service.PostService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

  PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String showPosts(Model model) {
    model.addAttribute("posts", postService.findAll());
    return "index";
  }

  @GetMapping("/addpost")
  public String addPost(Model model) {
    model.addAttribute("newPost", new Post());
    return "addpost";
  }

  @PostMapping("/savepost")
  public String savePost(@ModelAttribute("newPost") Post post, Model model) {
    postService.savePost(post);
    return "redirect:/";
  }

  @GetMapping("downvote/{id}")
  public String downvote(@PathVariable("id") Integer id) {
    postService.downvoteById(id);
    return "redirect:/";
  }


  @GetMapping("upvote/{id}")
  public String upnvote(@PathVariable("id") Integer id) {
    postService.upvoteById(id);
    return "redirect:/";
  }


}
