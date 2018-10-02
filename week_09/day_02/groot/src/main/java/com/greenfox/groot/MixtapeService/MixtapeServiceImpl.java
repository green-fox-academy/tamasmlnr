package com.greenfox.groot.MixtapeService;

import com.greenfox.groot.Models.Mixtape;
import com.greenfox.groot.Models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MixtapeServiceImpl implements MixtapeService {

  private Mixtape mixtape = new Mixtape();


  @Override
  public List<Song> findAllSongs() {
    return mixtape.getSongs();
  }

  @Override
  public void addSong(Song song) {
    mixtape.getSongs()
        .add(song);
  }

  @Override
  public Song findSong(String author, String title) {
    List<Song> songs = findAllSongs();
    for (Song song : songs) {
      if (song.getAuthor()
          .equals(author) && song.getTitle()
          .equals(title)) return song;
    }
    return null;
  }

  @Override
  public void delete(Song song) {
    mixtape.getSongs()
        .remove(song);
  }

  @Override
  public void changeRating(Song song, Double newrating) {
    song.setRating(newrating);
  }
}
