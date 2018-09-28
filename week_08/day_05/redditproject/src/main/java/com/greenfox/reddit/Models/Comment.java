package com.greenfox.reddit.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String author;
  private String content;
  private LocalDateTime localDateTime;

  public Comment() {
  }

  public Comment(String author, String content) {
    this.author = author;
    this.content = content;
    this.localDateTime = getLocalDateTime();
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
