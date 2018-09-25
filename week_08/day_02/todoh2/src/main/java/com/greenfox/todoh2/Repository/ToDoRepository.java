package com.greenfox.todoh2.Repository;

import com.greenfox.todoh2.Model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
