package com.greenfox.reddit;


import com.greenfox.reddit.Controller.PostAPIController;
import com.greenfox.reddit.Models.Post;
import com.greenfox.reddit.Models.PostDTO;
import com.greenfox.reddit.Service.PostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PostAPIController.class)
public class RedditApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private PostService postService;

  private BCryptPasswordEncoder bCryptPasswordEncoder;

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Test
  public void getUnauthorizedErrorwithoutUser() throws Exception {
    mockMvc.perform(get("/api/allposts"))
        .andExpect(status().isUnauthorized());
  }


//  @Test
//  @WithMockUser(username = "admin", password = "password")
//  public void existentUserCanGetTokenAndAuthentication() throws Exception {
////    String username = "admin";
////    String password = "password";
//
////    String body = "{    \"username\": \"admin\",    \"password\": \"password\"}";
//
////    mockMvc.perform(post("login"))
////        .andExpect(status().isOk())
////        .andDo(print());
//
//
//    mockMvc.perform(MockMvcRequestBuilders.post("/login")
//        .contentType(contentType)
//        .content(body)
//        .accept(contentType))
//        .andExpect(status().isOk());
////
////    String response = result.getResponse()
////        .getContentAsString();
////    response = response.replace("{\"access_token\": \"", "");
////    String token = response.replace("\"}", "");
////
////    mockMvc.perform(MockMvcRequestBuilders.get("/test")
////        .header("Authorization", "Bearer " + token))
////        .andExpect(status().isOk());
//  }


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
//
//    String response = result.getResponse()
//        .getContentAsString();
//    response = response.replace("{\"access_token\": \"", "");
//    String token = response.replace("\"}", "");
//
//    mockMvc.perform(MockMvcRequestBuilders.get("/test")
//        .header("Authorization", "Bearer " + token))
//        .andExpect(status().isOk());
  }


//  @Test
//  public void budgeReturnsRightAttractions() throws Exception {
//    List<Post> posts = new ArrayList<>();
//    posts.add(new Post("Test", "Test"));
//    PostDTO dto = new PostDTO(posts);
//    when(postService.listAllPosts()).thenReturn(dto);
//
//    mockMvc.perform(get("/"))
//        .andExpect(status().isOk())
//        .andExpect(content().contentType(contentType))
//        .andExpect(jsonPath("$.attractions.size()", is(1)))
//        .andDo(print());
//  }


}

