package com.greenfox.todoh2.Model;

public class ToDo {
  private long id;
  private String title;
  private Boolean urgent;
  private Boolean done;

  public ToDo(long id, String title) {
    this.id = id;
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Boolean getUrgent() {
    return urgent;
  }

  public void setUrgent(Boolean urgent) {
    this.urgent = urgent;
  }

  public Boolean getDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }
}
