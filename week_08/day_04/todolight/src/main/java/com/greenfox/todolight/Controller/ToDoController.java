package com.greenfox.todolight.Controller;

import com.greenfox.todolight.Model.ToDo;
import com.greenfox.todolight.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Controller
public class ToDoController {

  AtomicLong visitCounter = new AtomicLong();


  ToDoRepository toDoRepository;

  @Autowired
  public ToDoController(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  @GetMapping("/")
  public String greet(Model model) {
    long visitNumber = visitCounter.incrementAndGet();
    model.addAttribute("timesOpened", visitNumber);
    return "greet";
  }


  @GetMapping("/todo")
  public String todo(Model model) {
    List<ToDo> alltodo = toDoRepository.findAll();
    model.addAttribute("todolist", alltodo);
    model.addAttribute("newTodo", new ToDo());
    List<ToDo> filteredList = new ArrayList<>();
    model.addAttribute("filtered", filteredList);
    return "todo";
  }

  @PostMapping("/todo/save")
  public String saveNew(@ModelAttribute("newTodo") ToDo toDo, Model model) {
    toDoRepository.save(toDo);
    return "redirect:/todo";
  }

  @PostMapping("/todo/search")
  public String searchTodo(@RequestParam("content") String content, Model model) {
    List<ToDo> todos = toDoRepository.findByContentContaining(content);
    System.out.println(todos.toString());
    if (content.matches("-?\\d+")) todos.add(toDoRepository.findById(Integer.parseInt(content))
        .orElse(null));
    model.addAttribute("todolist", todos);
    model.addAttribute("newTodo", new ToDo());
    return "result";
  }

  @GetMapping("/todo/complete/{id}")
  public String complete(@PathVariable("id") Integer id, Model model) {
    ToDo toDo = toDoRepository.findById(id)
        .orElse(null);
    toDo.setDone(true);
    toDoRepository.save(toDo);
    return "redirect:/todo";
  }

  @GetMapping("/todo/delete/{id}")
  public String delete(@PathVariable("id") Integer id, Model model) {
    ToDo toDo = toDoRepository.findById(id)
        .orElse(null);
    toDoRepository.delete(toDo);
    return "redirect:/todo";
  }


}
