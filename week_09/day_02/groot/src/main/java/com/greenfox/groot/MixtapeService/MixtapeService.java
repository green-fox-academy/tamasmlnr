package com.greenfox.groot.MixtapeService;

import com.greenfox.groot.Models.Song;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MixtapeService {
  List<Song> findAllSongs();

  void addSong(Song song);

  Song findSong(String author, String title);

  void delete(Song song);

  void changeRating(Song song, Double newrating);
}
