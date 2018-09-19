package com.greenfoxacademy.messageservice.Service;

public class EmailService implements MessageService{

  @Override
  public String sendMessage() {
    return "Sending email..";
  }
}
