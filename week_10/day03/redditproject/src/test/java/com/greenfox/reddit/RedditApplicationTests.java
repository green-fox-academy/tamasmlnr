package com.greenfox.reddit;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.reddit.Controller.PostAPIController;
import com.greenfox.reddit.Models.Post;
import com.greenfox.reddit.Models.PostDTO;
import com.greenfox.reddit.Service.PostService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PostAPIController.class)
public class RedditApplicationTests {
  @Autowired
  private WebApplicationContext webApplicationContext;

  @Autowired
  private MockMvc mockMvc;

  @Before
  public void setUp() throws Exception {
    mockMvc = MockMvcBuilders
        .webAppContextSetup(webApplicationContext)
        .apply(springSecurity())
        .build();
  }


  @MockBean
  private PostService postService;

  private BCryptPasswordEncoder bCryptPasswordEncoder;

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Test
  public void getUnauthorizedErrorWithoutUserOnAllPosts() throws Exception {
    mockMvc.perform(get("/api/allposts"))
        .andExpect(status().isUnauthorized());
  }


  @Test

  public void getUnauthorizedIfPostingWithoutAccess() throws Exception {
    String newPost = "{\"content\":\"Hello\",\n" +
        "\"title\":\"This is sent with a token\"\n" +
        "}";

    mockMvc.perform(MockMvcRequestBuilders.post("/api/newpost")
        .with(csrf())
        .header("Content-Type", "application/json")
        .content(newPost)
        .accept(contentType))
        .andExpect(status().isUnauthorized());
  }


  @Test
  @WithMockUser(username = "admin", password = "password")
  public void ableToPostWithAuthenticatedUser() throws Exception {
    String newPost = "{\"content\":\"Hello\",\n" +
        "\"title\":\"This is sent with a token\"\n" +
        "}";

    mockMvc.perform(MockMvcRequestBuilders.post("/api/newpost")
        .with(csrf())
        .header("Content-Type", "application/json")
        .content(newPost)
        .accept(contentType))
        .andExpect(status().isOk());
  }


  //
  @Test
  @WithMockUser(username = "admin", password = "password")
  public void existentUserCanGetTokenAndAuthentication() throws Exception {

    List<Post> posts = new ArrayList<>();
    posts.add(new Post("Test", "Test"));
    PostDTO dto = new PostDTO(posts);
    when(postService.listAllPosts()).thenReturn(dto);

    mockMvc.perform(get("/api/allposts"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andDo(print());
  }

}


