package com.greenfox.todoh2;

import com.greenfox.todoh2.Model.ToDo;
import com.greenfox.todoh2.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todoh2Application implements CommandLineRunner {

  @Autowired
  ToDoRepository toDoRepository;

  public static void main(String[] args) {
    SpringApplication.run(Todoh2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    toDoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
    toDoRepository.save(new ToDo("I have to eat a carrot"));
  }
}
