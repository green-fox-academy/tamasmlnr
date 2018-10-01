package com.greenfox.est.Models.DTOs;

public class Append {

  private String appended;

  public Append(String toAppend) {
    this.appended = toAppend + "a";
  }

  public Append() {
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
