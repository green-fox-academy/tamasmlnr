package com.greenfox.todoh2.Controller;

import com.greenfox.todoh2.Model.ToDo;
import com.greenfox.todoh2.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    List<ToDo> todos = toDoRepository.findAll();
    model.addAttribute("todos", todos);
    return "/todolist";
  }

}
