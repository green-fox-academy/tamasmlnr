package com.greenfox.todomysql.Controller;

import com.greenfox.todomysql.Model.ToDo;
import com.greenfox.todomysql.Repository.ToDoRepository;
import com.greenfox.todomysql.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping(value = "/addtodo")
  public String addTodo(Model model) {
    model.addAttribute("newTodo", new ToDo());
    return "addtodo";
  }

  @PostMapping(value = "/save")
  public String SaveTodo(@ModelAttribute("newTodo") ToDo newTodo, Model model) {
    toDoRepository.save(newTodo);
    return "redirect:/todo";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable("id") long id, Model model) {
    toDoRepository.deleteById(id);
    return "redirect:/todo";
  }

  @GetMapping(value = "/edit/{id}")
  public String edit(@PathVariable("id") long id, Model model) {
    ToDo todo = toDoRepository.findById(id)
        .orElse(null);
    model.addAttribute("todo", todo);
    return "edit";
  }

  @PostMapping(value = "/saveedited")
  public String saveedited(@ModelAttribute ToDo toDo, Model model) {
    toDoRepository.save(toDo);
    return "redirect:/todo";
  }

  @GetMapping(value = {"", "/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) Boolean isActive, Model model) {
    List<ToDo> todos = toDoRepository.findAll();
    todos = todos.stream()
        .sorted((o1, o2) -> (int) o1.getId() - (int) o2.getId())
        .collect(Collectors.toList());
    if (isActive != null) {
      model.addAttribute("todotasks", toDoRepository.findByDone(false));
      return "/todolist";
    }
    model.addAttribute("todotasks", todos);
    return "/todolist";
  }


}
