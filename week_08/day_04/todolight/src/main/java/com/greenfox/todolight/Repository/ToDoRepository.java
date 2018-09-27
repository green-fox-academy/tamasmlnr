package com.greenfox.todolight.Repository;

import com.greenfox.todolight.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Integer> {
  List<ToDo> findAll();

  List<ToDo> findByContentContaining(String content);

}
