package com.greenfox.est.Models.DTOs;

public class Greeting {
  public String welcome_message;

  public Greeting(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public Greeting() {
  }

  public String getWelcomeMessage() {
    return welcome_message;
  }

  public void setWelcomeMessage(String welcomeMessage) {
    this.welcome_message = welcomeMessage;
  }
}
