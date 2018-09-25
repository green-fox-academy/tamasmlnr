package com.greenfox.todomysql.Repository;

import com.greenfox.todomysql.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
