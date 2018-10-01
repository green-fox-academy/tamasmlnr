package com.greenfox.est.Models.DTOs;

public class DoUntil {
  private Integer result;

  public DoUntil() {
  }

  public DoUntil(String action, int until) {
    if (action.equals("sum")) {
      this.result = sum(until);
    } else if (action.equals("factor")) {
      this.result = factor(until);
    }
  }

  public int sum(Integer number) {
    int result = 0;
    for (int i = 0; i <= number; i++) {
      result += i;
    }
    return result;
  }

  public Integer factor(int number) {
    int result = 1;
    for (int j = 1; j <= number; j++) {
      result *= j;
    }
    return result;
  }


  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}