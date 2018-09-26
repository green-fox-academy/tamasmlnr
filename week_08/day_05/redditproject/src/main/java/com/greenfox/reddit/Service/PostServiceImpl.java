package com.greenfox.reddit.Service;

import com.greenfox.reddit.Models.Post;
import com.greenfox.reddit.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> findAll() {
    List<Post> posts = postRepository.findAll();
    return posts;
  }

  @Override
  public void savePost(Post post) {
    postRepository.save(post);
  }
}
