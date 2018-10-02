package com.greenfox.groot.Models;

import java.util.ArrayList;
import java.util.List;

public class Mixtape {

  private List<Song> songs;

  public Mixtape() {
    this.songs = new ArrayList<>();
    songs.add(new Song("Blue Swede", "Hooked on a Feeling", "pop", 1968, 10.0));
    songs.add(new Song("Raspberries", "Go All The Way", "rock", 1972, 8.2));
    songs.add(new Song("Redbone", "Come and Get Your Love", "pop", 1974, 7.8));
    songs.add(new Song("David Bowie", "Moonage Daydream", "rock", 1971, 10.0));
    songs.add(new Song("David Bowie", "Space Oddity", "rock", 1969, 9.5));
    songs.add(new Song("David Bowie", "Starman", "rock", 1972, 9.8));
    songs.add(new Song("10cc", "I'm not in love", "rock", 1975, 9.0));
    songs.add(new Song("10cc", "I'm not in love", "rock", 1975, 9.0));
    songs.add(new Song("Cat Stevens", "Father and Son", "rock", 1975, 8.0));
    songs.add(new Song("Jackson 5", "I Want You Back", "rock", 1969, 7.0));
  }

  public List<Song> getSongs() {
    return songs;
  }

  public void setSongs(List<Song> songs) {
    this.songs = songs;
  }
}
