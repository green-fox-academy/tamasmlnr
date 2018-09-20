package com.greenfox.fox.Models;

import java.util.ArrayList;

public class FoxList {
  ArrayList<Fox> foxes;

  public FoxList() {
    foxes = new ArrayList<>();
  }

  public ArrayList<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(ArrayList<Fox> foxes) {
    this.foxes = foxes;
  }
}
