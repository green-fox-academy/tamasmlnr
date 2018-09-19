package com.greenfox.javadi.Service;

import java.util.List;

public interface StudentService {
  int countStudents();

  List<String> findAll();

  void save(String student);

  boolean checkIfStudentExists(String name);
}
