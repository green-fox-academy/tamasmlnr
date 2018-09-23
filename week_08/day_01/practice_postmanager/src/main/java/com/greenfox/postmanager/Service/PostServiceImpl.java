package com.greenfox.postmanager.Service;

import com.greenfox.postmanager.Model.Post;
import com.greenfox.postmanager.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

  PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public PostServiceImpl() {
  }

  public List<Post> getAllPosts() {
    List<Post> posts = new ArrayList<>();
    postRepository.findAll()
        .forEach(posts::add);
    posts = posts.stream()
        .sorted((o1, o2) -> (int) o2.getId() - (int) o1.getId())
        .collect(Collectors.toList());
    return posts;
  }

  public Post getPostById(Long id) {
    return postRepository.findById(id)
        .orElse(null);
  }

  public void addPost(String content) {
    postRepository.save(new Post(content));
  }

  public void updatePost(Post post) {
    postRepository.save(post);
  }

  public void deletePost(Post post) {
    postRepository.delete(post);
  }


}
