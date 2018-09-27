package com.greenfox.error.service;

import com.greenfox.error.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UService {

  private ArrayList<User> users;

  public UService() {
    this.users = new ArrayList<>();
  }

  public ArrayList<User> getAll() {
    return users;
  }

  public void save(User user) {
    users.add(user);
  }

  public UService service() {
    return new UService();
  }
}
