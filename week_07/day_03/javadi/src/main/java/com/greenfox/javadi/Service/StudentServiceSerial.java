package com.greenfox.javadi.Service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("Serial")
public class StudentServiceSerial implements StudentService {

  private FileOutputStream fileOut;
  private ObjectOutputStream out;
  private FileInputStream fileIn;
  private ObjectInputStream in;
  private String path;
  ArrayList<String> names;

  public StudentServiceSerial() {
    path = "C:\\Users\\Tamás\\greenfox\\tamasmlnr\\week_07\\day_03\\javadi\\src\\main\\java\\com\\greenfox\\javadi\\data.ser";
    names = readFromFile();
  }

  public ArrayList<String> readFromFile() {
    ArrayList<String> list = new ArrayList<>();
    try {
      fileIn = new FileInputStream(path);
      in = new ObjectInputStream(fileIn);
      list = (ArrayList<String>) in.readObject();
      in.close();
      fileIn.close();
    } catch (IOException e) {

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return list;
  }


  @Override
  public int countStudents() {
    return names.size();
  }

  @Override
  public List<String> findAll() {
    return names;
  }

  public void readFromList(ArrayList<String> list) {
    names = list;
  }

  @Override
  public void save(String student) {
    try {
      names.add(student);
      fileOut = new FileOutputStream(path);
      out = new ObjectOutputStream(fileOut);
      out.writeObject(names);
      out.close();
      fileOut.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public boolean checkIfStudentExists(String name) {
    if (names.contains(name)) return true;
    return false;
  }
}
