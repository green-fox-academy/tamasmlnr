package com.greenfox.todomysql.Controller;

import com.greenfox.todomysql.Model.ToDo;
import com.greenfox.todomysql.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  ToDoRepository toDoRepository;

  @Autowired
  public ToDoController(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  @GetMapping(value = {"", "/", "/list"})
  public String list(Model model) {
    Iterable<ToDo> todos = toDoRepository.findAll();
    model.addAttribute("todos", todos);
    return "/todolist";
  }

}
