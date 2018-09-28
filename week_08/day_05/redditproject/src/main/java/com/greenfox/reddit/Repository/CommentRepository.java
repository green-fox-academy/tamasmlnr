package com.greenfox.reddit.Repository;

import com.greenfox.reddit.Models.Comment;
import com.greenfox.reddit.Models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Long> {
  List<Comment> findAll();
  List<Comment> findAllByPostId(Long id);
}
