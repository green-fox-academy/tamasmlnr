package com.greenfox.fox.Services;

import com.greenfox.fox.Models.Fox;
import com.greenfox.fox.Models.FoxList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class FoxService {

  FoxList foxList;

  public FoxService() {
    foxList = new FoxList();
  }

  public FoxList getFoxList() {
    return foxList;
  }

  public void setFoxList(FoxList foxList) {
    this.foxList = foxList;
  }

  public Fox getByName(String name) {
    Fox foundFox = foxList.getFoxes()
        .stream()
        .filter(fox -> fox.getName()
            .equals(name))
        .findFirst()
        .orElse(null);
    return foundFox;
  }

  public void createNew(String name) {
    Fox newFox = new Fox(name);
    foxList.getFoxes()
        .add(newFox);
    System.out.println(newFox);
  }

  public List<String> getFoodList() {
    ArrayList<String> foodList = new ArrayList<>();
    foodList.add("pizza");
    foodList.add("apples");
    foodList.add("hamburger");
    foodList.add("honeydew");
    return foodList;
  }

  public List<String> getDrinkList() {
    ArrayList<String> drinkList = new ArrayList<>();
    drinkList.add("lemonade");
    drinkList.add("Mountain Dew");
    drinkList.add("water");
    drinkList.add("petroleum");
    return drinkList;
  }

  public List<String> getTaskList() {
    ArrayList<String> trickList = new ArrayList<>();
    trickList.add("Code HTML");
    trickList.add("Code in Java");
    trickList.add("Sing 'I will always love you' by Whitney Houston");
    trickList.add("Watch Dallas");
    return trickList;
  }

}
