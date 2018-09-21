package com.greenfox.pun.service;

import com.greenfox.pun.model.Joke;
import com.greenfox.pun.repository.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class JokeServiceImpl implements JokeService {

  @Autowired
  JokeRepository jokeRepository;

  public JokeServiceImpl() {
  }

  public JokeServiceImpl(JokeRepository jokeRepository) {
    this.jokeRepository = jokeRepository;
  }

  public Joke getJoke(int id) {
    Joke joke = jokeRepository.findById(id)
        .orElse(null);
    return joke;
  }

  public List<Joke> getAllJokes() {
    List<Joke> jokes = new ArrayList<>();
    jokeRepository.findAll()
        .forEach(jokes::add);
    return jokes;
  }

  public void addJoke(Joke joke) {
    jokeRepository.save(joke);
  }

  public Joke getRandomJoke() {
    List<Joke> jokes = getAllJokes();
    Joke randomJoke = jokes.get((int) (Math.random() * jokes.size()));
    return randomJoke;
  }

}
