package com.greenfox.reddit.Service;

import com.greenfox.reddit.Models.Comment;
import com.greenfox.reddit.Models.Post;
import com.greenfox.reddit.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

  private CommentRepository commentRepository;

  @Autowired
  public CommentServiceImpl(CommentRepository commentRepository) {
    this.commentRepository = commentRepository;
  }

  @Override
  public List<Comment> findAll() {
    List<Comment> comments = commentRepository.findAll();
    return comments;
  }

  public List<Comment> findAllByPostId(Long id) {
    return commentRepository.findAllByPostId(id);
  }

  @Override
  public void save(Comment comment) {
    commentRepository.save(comment);
  }
}
