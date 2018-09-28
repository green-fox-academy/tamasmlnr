package com.greenfox.reddit.Controller;

import com.greenfox.reddit.Models.Comment;
import com.greenfox.reddit.Models.Post;
import com.greenfox.reddit.Service.CommentService;
import com.greenfox.reddit.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

  private PostService postService;
  private CommentService commentService;

  @Autowired
  public PostController(PostService postService, CommentService commentService) {
    this.postService = postService;
    this.commentService = commentService;
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
  public String upvote(@PathVariable("id") Integer id) {
    postService.upvoteById(id);
    return "redirect:/";
  }

}
