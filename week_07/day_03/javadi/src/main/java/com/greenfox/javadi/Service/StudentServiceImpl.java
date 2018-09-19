package com.greenfox.javadi.Service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
  ArrayList<String> names;

  public StudentServiceImpl() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  @Override
  public int countStudents() {
    return names.size();
  }

  @Override
  public List<String> findAll() {
    return names;
  }

  @Override
  public void save(String student) {
    names.add(student);
  }

  @Override
  public boolean checkIfStudentExists(String name) {
    if (names.contains(name)) return true;
    return false;
  }
}
