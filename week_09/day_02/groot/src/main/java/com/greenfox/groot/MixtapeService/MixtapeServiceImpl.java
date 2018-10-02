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
}
