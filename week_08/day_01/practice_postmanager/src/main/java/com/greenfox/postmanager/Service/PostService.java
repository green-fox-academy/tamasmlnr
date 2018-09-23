package com.greenfox.postmanager.Service;

import com.greenfox.postmanager.Model.Post;

import java.util.List;

public interface PostService {

  void addPost(String content);

  void deletePost(Post post);

  Post getPostById(Long id);

  List<Post> getAllPosts();

}
