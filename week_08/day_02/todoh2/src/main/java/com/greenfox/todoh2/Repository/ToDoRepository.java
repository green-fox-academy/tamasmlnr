package com.greenfox.todoh2.Repository;

import com.greenfox.todoh2.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

  List<ToDo> findAll();
}
