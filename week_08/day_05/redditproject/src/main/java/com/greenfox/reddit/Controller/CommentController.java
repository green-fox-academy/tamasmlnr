package com.greenfox.reddit.Controller;

import com.greenfox.reddit.Models.Comment;
import com.greenfox.reddit.Models.Post;
import com.greenfox.reddit.Service.CommentService;
import com.greenfox.reddit.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {

  private PostService postService;
  private CommentService commentService;

  @Autowired
  public CommentController(PostService postService, CommentService commentService) {
    this.postService = postService;
    this.commentService = commentService;
  }

  @GetMapping("/post/{id}")
  public String showComment(@PathVariable("id") Long id, Model model) {
    Post post = postService.findById(id);
    model.addAttribute("post", post);
    model.addAttribute("newComment", new Comment());
    model.addAttribute("comments", commentService.findAll());
    return "post";
  }

  @PostMapping("/savecomment")
  public String saveComment(@ModelAttribute("newComment") Comment comment, Model model) {
    commentService.save(comment);
    return "redirect:/";
  }
}
