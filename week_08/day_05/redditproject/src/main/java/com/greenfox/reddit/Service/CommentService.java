package com.greenfox.reddit.Service;

import com.greenfox.reddit.Models.Comment;
import com.greenfox.reddit.Models.Post;

import java.util.List;

public interface CommentService {

  List<Comment> findAll();

  List<Comment> findAllByPostId(Long id);

  void save(Comment comment);
}

