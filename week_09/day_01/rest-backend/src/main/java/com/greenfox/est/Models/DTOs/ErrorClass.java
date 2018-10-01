package com.greenfox.est.Models.DTOs;
public class ErrorClass {

  private String error;

  public ErrorClass(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}