package com.greenfox.fox.Models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private String food;
  private String drink;
  private List<String> tricks;

  public Fox(String name) {
    tricks = new ArrayList<>();
    this.name = name;
    this.food = "apples";
    this.drink = "mountain dew";
  }

  public Fox() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public void addTrick(String trick) {
    tricks.add(trick);
  }

  public int getTrickCount() {
    return tricks.size();
  }
}
