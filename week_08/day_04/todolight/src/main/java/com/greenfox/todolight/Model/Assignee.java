package com.greenfox.todolight.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String email;


  @OneToMany(mappedBy = "assignee")
  private List<ToDo> toDos;

  public void addToDos(List<ToDo> todos) {
    this.toDos = todos;
  }

  public List<ToDo> getToDos() {
    return toDos;
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public Assignee() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String toString() {
    return "" + this.name;
  }
}
