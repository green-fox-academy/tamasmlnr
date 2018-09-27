package com.greenfox.todolight.Repository;

import com.greenfox.todolight.Model.Assignee;
import com.greenfox.todolight.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
  List<Assignee> findAll();

  Assignee findByNameIs(String name);

}
