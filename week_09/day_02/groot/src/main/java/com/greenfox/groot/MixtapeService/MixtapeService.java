package com.greenfox.groot.MixtapeService;

import com.greenfox.groot.Models.Song;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MixtapeService {
  List<Song> findAllSongs();

  Song addSong(Song song);

  Song findSong(String author, String title);

  void delete(Song song);

  Song changeRating(Song song, Double newrating);

  List<Song> findTop(Integer top);
}
