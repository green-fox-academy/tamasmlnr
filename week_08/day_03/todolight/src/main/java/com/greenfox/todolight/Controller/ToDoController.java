package com.greenfox.todolight.Controller;

import com.greenfox.todolight.Model.ToDo;
import com.greenfox.todolight.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class ToDoController {

    AtomicLong visitCounter = new AtomicLong();

    @GetMapping("/")
    public String greet(Model model) {
      long visitNumber = visitCounter.incrementAndGet();
      model.addAttribute("timesOpened", visitNumber);
      return "greet";
    }


    ToDoRepository toDoRepository;

    @Autowired
    public ToDoController(ToDoRepository toDoRepository) {
      this.toDoRepository = toDoRepository;
    }

    @GetMapping("/todo")
    public String todo(Model model) {
      List<ToDo> alltodo = toDoRepository.findAll();
      model.addAttribute("todolist", alltodo);
      model.addAttribute("newTodo", new ToDo());
      return "todo";
    }

    @PostMapping("/todo/save")
    public String saveNew(@ModelAttribute("newTodo") ToDo toDo, Model model) {
      toDoRepository.save(toDo);
      return "redirect:/todo";
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
