package com.greenfox.javadi.Service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
  ArrayList<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  public int countStudents() {
    return names.size();
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }
}
