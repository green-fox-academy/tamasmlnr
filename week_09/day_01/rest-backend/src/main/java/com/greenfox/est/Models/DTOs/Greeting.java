package com.greenfox.est.Models.DTOs;

public class Greeting {
  public String welcomeMessage;

  public Greeting(String name, String title) {
    this.welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public Greeting() {
  }

  public String getWelcomeMessage() {
    return welcomeMessage;
  }

  public void setWelcomeMessage(String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }
}
