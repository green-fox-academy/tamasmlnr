package com.greenfox.reddit.Repository;

import com.greenfox.reddit.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
