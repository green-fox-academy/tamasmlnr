package com.greenfox.est.Models.DTOs;

public class ArrayCalculator {

  private Integer result;

  public ArrayCalculator(String what, Integer[] input) {
    if (what.equals("sum")) {
      this.result = sum(input);
    }
    if (what.equals("multiply")) {
      this.result = multiple(input);
    }
  }

  public ArrayCalculator() {
  }

  private Integer multiple(Integer[] input) {
    int mult = 1;
    for (int number : input) {
      mult *= number;
    }
    return mult;
  }

  public int sum(Integer[] input) {
    int sum = 0;
    for (int number : input) {
      sum += number;
    }
    return sum;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
