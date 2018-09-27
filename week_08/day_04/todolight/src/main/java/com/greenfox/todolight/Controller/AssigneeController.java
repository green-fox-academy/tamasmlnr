package com.greenfox.todolight.Controller;


import com.greenfox.todolight.Model.Assignee;
import com.greenfox.todolight.Repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AssigneeController {

  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeController(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @GetMapping("/todo/assignees")
  public String showAssignees(Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assignees";
  }


}
