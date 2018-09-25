package com.greenfox.todomysql.Controller;

import com.greenfox.todomysql.Model.ToDo;
import com.greenfox.todomysql.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  ToDoRepository toDoRepository;

  @Autowired
  public ToDoController(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  @GetMapping(value = {"", "/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) Boolean isActive, Model model) {
    List<ToDo> todos = toDoRepository.findAll();
    if (isActive != null) {
      List<ToDo> todosFiltered = todos.stream()
          .filter(todo -> todo.getDone() == false)
          .collect(Collectors.toList());
      model.addAttribute("todotasks", todosFiltered);
      return "/todolist";
    }

    model.addAttribute("todotasks", todos);
    return "/todolist";
  }

}
