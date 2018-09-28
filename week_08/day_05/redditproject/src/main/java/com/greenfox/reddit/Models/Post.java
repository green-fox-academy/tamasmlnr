package com.greenfox.reddit.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
public class Post implements Comparable<Post> {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String content;
  private String title;
  private int score = 0;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
  List<Comment> comments;

  public Post(String content, String title) {
    this.content = content;
    this.title = title;
  }

  public Post() {
  }

  public List<Comment> getAllComment() {
    return comments;
  }

  public void addComment(Comment comment) {
    comments.add(comment);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public int compareTo(Post o) {
    return o.score - this.score;
  }
}
