package com.greenfox.est.Models.DTOs;

public class Text {

  private String text;

  public Text(String string) {
    this.text = string;
  }

  public Text() {
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
