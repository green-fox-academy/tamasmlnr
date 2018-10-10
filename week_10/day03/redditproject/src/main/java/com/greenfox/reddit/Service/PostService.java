package com.greenfox.reddit.Service;


import com.greenfox.reddit.Models.Comment;
import com.greenfox.reddit.Models.Post;
import com.greenfox.reddit.Models.PostDTO;

import java.util.List;

public interface PostService {

  List<Post> findAll();

  void savePost(Post post);

  void downvoteById(Integer id);

  void upvoteById(Integer id);

  Post findById(Long id);

  void saveComment(Comment comment, Long id);

  PostDTO listAllPosts();
}
