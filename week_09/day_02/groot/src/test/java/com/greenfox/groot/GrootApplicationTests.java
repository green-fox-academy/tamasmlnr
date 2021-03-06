package com.greenfox.groot;

import com.greenfox.groot.Controller.GuardianController;
import com.greenfox.groot.MixtapeService.MixtapeService;
import com.greenfox.groot.Models.Mixtape;
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

import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GrootApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private MixtapeService mixtapeService;

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Test
  public void testGrootWhenParamaterIsGiven() throws Exception {
    String message = "somemessage";
    String iamgroot = "I am groot!";

    mockMvc.perform(get("/groot?message=" + message))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.received", is(message)))
        .andExpect(jsonPath("$.translated", is(iamgroot)))
        .andDo(print());
  }

  @Test
  public void testGrootWhenParamaterIsNotGiven() throws Exception {
    String iamgroot = "I am Groot!";

    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is(iamgroot)))
        .andDo(print());
  }

  @Test
  public void testYonduWhenParamaterIsGiven() throws Exception {
    Double distance = 100.0;
    Double time = 10.0;

    mockMvc.perform(get("/yondu?distance=" + distance + "&time=" + time))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.distance", is(distance)))
        .andExpect(jsonPath("$.time", is(time)))
        .andExpect(jsonPath("$.speed", is(distance / time)))
        .andDo(print());
  }

  @Test
  public void testYonduWhenParamaterIsNotGiven() throws Exception {


    mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is("Missing parameters!")))
        .andDo(print());
  }




}
