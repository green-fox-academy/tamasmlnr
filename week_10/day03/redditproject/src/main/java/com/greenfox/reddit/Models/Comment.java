package com.greenfox.reddit.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String author;
  private String content;
  private LocalDateTime localDateTime;

  @JsonIgnore
  @ManyToOne
  private Post post;

  public Comment() {
  }

  public void setPost(Post post) {
    this.post = post;
  }

  public Post getPost() {
    return this.post;
  }

  public Comment(String author, String content) {
    this.author = author;
    this.content = content;
    this.localDateTime = LocalDateTime.now();
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public LocalDateTime getLocalDateTime() {
    return localDateTime;
  }

  public void setLocalDateTime(LocalDateTime localDateTime) {
    this.localDateTime = localDateTime;
  }
}
