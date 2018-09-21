package com.greenfox.pun.repository;

import com.greenfox.pun.model.Joke;
import org.springframework.data.repository.CrudRepository;

public interface JokeRepository extends CrudRepository<Joke, Integer> {

}
