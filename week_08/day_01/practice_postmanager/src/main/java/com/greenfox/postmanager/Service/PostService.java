package com.greenfox.postmanager.Service;

import com.greenfox.postmanager.Model.Post;

import java.util.List;

public interface PostService {

  void addPost(Post post);
  void delete(Post post);
  List<Post> getPostList();
  Post getPostById(Long id);

}
