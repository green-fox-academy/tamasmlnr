package com.greenfox.pun.service;

import com.greenfox.pun.model.Joke;

import java.util.List;

public interface JokeService {

  List<Joke> getAllJokes();

  Joke getRandomJoke();
}
