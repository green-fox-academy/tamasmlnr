package com.greenfox.groot;

import com.greenfox.groot.Controller.GuardianController;
import com.greenfox.groot.MixtapeService.MixtapeService;
import com.greenfox.groot.Models.Mixtape;
import com.greenfox.groot.Models.Song;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class AwesomeMixTests {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private MixtapeService mixtapeService;

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Test
  public void testGetEverything() throws Exception {

    List<Song> songs = new ArrayList<>();
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

    when(mixtapeService.findAllSongs()).thenReturn(songs);

    mockMvc.perform(get("/awesome"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$[0].author", is("Blue Swede")))
        .andDo(print());
  }

  @Test
  public void testGetBestThreeSongs() throws Exception {

    List<Song> songs = new ArrayList<>();
    songs.add(new Song("Blue Swede", "Hooked on a Feeling", "pop", 1968, 10.0));
    songs.add(new Song("Raspberries", "Go All The Way", "rock", 1972, 8.2));
    songs.add(new Song("Redbone", "Come and Get Your Love", "pop", 1974, 7.8));


    when(mixtapeService.findTop(3)).thenReturn(songs);

    mockMvc.perform(get("/awesome/top/3"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.size()", is(3)))
        .andDo(print());
  }


}
