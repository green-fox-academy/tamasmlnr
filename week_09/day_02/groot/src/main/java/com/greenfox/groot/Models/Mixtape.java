package com.greenfox.groot.Models;

import java.util.List;

public class Mixtape {

  private List<Song> songs;

  public Mixtape(List<Song> songs) {
    this.songs = songs;
  }

  public List<Song> getSongs() {
    return songs;
  }

  public void setSongs(List<Song> songs) {
    this.songs = songs;
  }
}
