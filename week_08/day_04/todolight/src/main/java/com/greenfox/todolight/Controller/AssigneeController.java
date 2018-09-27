package com.greenfox.todolight.Controller;


import com.greenfox.todolight.Model.Assignee;
import com.greenfox.todolight.Model.ToDo;
import com.greenfox.todolight.Repository.AssigneeRepository;
import com.greenfox.todolight.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AssigneeController {

  private AssigneeRepository assigneeRepository;
  private ToDoRepository toDoRepository;

  @Autowired
  public AssigneeController(AssigneeRepository assigneeRepository, ToDoRepository toDoRepository) {
    this.assigneeRepository = assigneeRepository;
    this.toDoRepository = toDoRepository;
  }

  @GetMapping("/todo/assignees")
  public String showAssignees(Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assignees";
  }

  @GetMapping("/todo/editassignee/{id}")
  public String edit(@PathVariable("id") Long id, Model model) {
    Assignee toEdit = assigneeRepository.findById(id)
        .orElse(null);
    model.addAttribute("assignee", toEdit);
    return "edit";
  }

  @GetMapping("/todo/deleteassignee/{id}")
  public String delete(@PathVariable("id") Long id, Model model) {
    assigneeRepository.deleteById(id);
    return "redirect:/todo/assignees";
  }


  @PostMapping("/todo/saveedited")
  public String saveedited(@ModelAttribute("assignee") Assignee assignee, Model model) {
    assigneeRepository.save(assignee);
    return "redirect:/todo/assignees";
  }


  @PostMapping("/todo/savepostassignee")
  public String savepostassignee(@RequestParam("assigneeId") String assignee, @RequestParam("id") Integer id, Model model) {
    System.out.println(assignee);
    System.out.println(id);
    Assignee assi = assigneeRepository.findByNameIs(assignee);
    ToDo save = toDoRepository.findById(id)
        .get();

    save.setAssignee(assi);
    toDoRepository.save(save);
    return "redirect:/todo/";
  }

}
