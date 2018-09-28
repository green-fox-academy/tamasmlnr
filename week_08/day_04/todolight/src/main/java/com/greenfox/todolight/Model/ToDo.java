package com.greenfox.todolight.Model;

import javax.persistence.*;

@Entity
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String content;
  private boolean done;

  @ManyToOne
  private Assignee assignee;

  public ToDo(String content) {
    this.content = content;
    this.done = false;
  }

  public ToDo() {
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public Assignee getAssignee() {
    return this.assignee;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
