package com.greenfox.est.Models.DTOs;

public class ArrayCalculatorDouble {

  private Integer[] result;

  public ArrayCalculatorDouble(Integer[] whatToDouble) {
    this.result = doublenumbers(whatToDouble);
  }

  public Integer[] doublenumbers(Integer[] numbers) {
    Integer[] resultnumbers = new Integer[numbers.length];

    for (Integer i = 0; i < numbers.length; i++) {
      resultnumbers[i] = numbers[i] * 2;
    }
    return resultnumbers;
  }

  public Integer[] getResult() {
    return result;
  }

  public void setResult(Integer[] result) {
    this.result = result;
  }
}
