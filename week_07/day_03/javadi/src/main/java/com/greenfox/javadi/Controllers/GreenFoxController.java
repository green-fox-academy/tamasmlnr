package com.greenfox.javadi.Controllers;

import com.greenfox.javadi.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GreenFoxController {

  @Autowired
  StudentService studentService;

  @GetMapping("/gfa")
  public String gfaMain(Model model) {
    model.addAttribute("count", studentService.countStudents());
    return "gfaindex";
  }

  @GetMapping("/gfa/list")
  public String studentList(Model model) {
    List<String> students = studentService.findAll();
    model.addAttribute("students", students);
    return "studentlist";
  }

  @GetMapping("/gfa/add")
  public String studentAdder(Model model) {
    String studentName = "";
    model.addAttribute("name", studentName);
    return "addstudent";
  }

  @GetMapping("/gfa/save")
  public String saveStudent(@RequestParam("name") String name, Model model) {
    studentService.save(name);
    return "redirect:list";
  }


}
