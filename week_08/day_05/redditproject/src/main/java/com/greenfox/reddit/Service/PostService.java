package com.greenfox.reddit.Service;


import com.greenfox.reddit.Models.Post;

import java.util.List;

public interface PostService {

  List<Post> findAll();

  void savePost(Post post);
}
