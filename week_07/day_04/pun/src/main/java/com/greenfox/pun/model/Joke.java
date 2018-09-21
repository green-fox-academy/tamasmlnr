package com.greenfox.pun.model;


import javax.persistence.*;

@Entity
public class Joke {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String joke;

  public Joke(int id, String joke) {
    this.id = id;
    this.joke = joke;
  }

  public Joke() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getJoke() {
    return joke;
  }

  public void setJoke(String joke) {
    this.joke = joke;
  }

  public String toString() {
    return this.joke;
  }


}
