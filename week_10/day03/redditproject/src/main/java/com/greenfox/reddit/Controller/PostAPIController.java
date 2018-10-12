package com.greenfox.reddit.Controller;


import com.greenfox.reddit.Models.Post;
import com.greenfox.reddit.Models.PostDTO;
import com.greenfox.reddit.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostAPIController {

  private PostService postService;

  @Autowired
  public PostAPIController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/api/allposts")
  private ResponseEntity<?> getAllPosts() {
    return ResponseEntity.status(HttpStatus.OK)
        .body(postService.listAllPosts());
  }

  @PostMapping("/api/newpost")
  private void newPost(@RequestBody Post post) {
    postService.savePost(post);
  }

  @PostMapping("/api/multiplepost")
  private void addMultiplePosts(@RequestBody PostDTO postDTO) {
    postService.savePostsFromDTO(postDTO);
  }


}
