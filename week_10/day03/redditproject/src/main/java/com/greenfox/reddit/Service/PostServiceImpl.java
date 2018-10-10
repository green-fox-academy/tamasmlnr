package com.greenfox.reddit.Service;

import com.greenfox.reddit.Models.Comment;
import com.greenfox.reddit.Models.Post;
import com.greenfox.reddit.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  PostRepository postRepository;
  CommentService commentService;

  @Autowired
  public PostServiceImpl(CommentService commentService, PostRepository postRepository) {
    this.postRepository = postRepository;
    this.commentService = commentService;
  }

  @Override
  public List<Post> findAll() {
    List<Post> posts = postRepository.findAll();
    Collections.sort(posts);
    return posts;
  }

  @Override
  public void savePost(Post post) {
    postRepository.save(post);
  }

  @Override
  public void downvoteById(Integer id) {
    Long lid = (long) id;
    Post post = postRepository.findById(lid)
        .orElse(null);
    post.setScore(post.getScore() - 1);
    postRepository.save(post);
  }

  @Override
  public void upvoteById(Integer id) {
    Long lid = (long) id;
    Post post = postRepository.findById(lid)
        .orElse(null);
    post.setScore(post.getScore() + +1);
    postRepository.save(post);
  }

  @Override
  public Post findById(Long id) {
    Post post = postRepository.findById(id)
        .orElse(null);
    return post;
  }

  @Override
  public void saveComment(Comment comment, Long id) {
    Post post = findById(id);
    comment.setLocalDateTime(LocalDateTime.now());
    comment.setPost(post);
    commentService.save(comment);
  }
}
