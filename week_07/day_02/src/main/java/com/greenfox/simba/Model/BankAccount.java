package com.greenfox.simba.Model;


public class BankAccount {


  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private boolean isGoodGuy;

  public BankAccount(String name, int balance, String animalType, boolean isGoodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = false;
    this.isGoodGuy = isGoodGuy;
  }

  public boolean isGoodGuy() {
    return isGoodGuy;
  }

  public void setGoodGuy(boolean goodGuy) {
    isGoodGuy = goodGuy;
  }

  public BankAccount() {
  }

  public void makeKing() {
    this.isKing = true;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public void increaseAmount() {
    this.balance += 10;
    if (this.isKing()) balance += 90;
  }
}
