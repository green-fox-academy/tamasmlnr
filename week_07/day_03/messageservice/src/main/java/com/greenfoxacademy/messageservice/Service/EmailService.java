package com.greenfoxacademy.messageservice.Service;

import org.springframework.stereotype.Service;

public class EmailService implements MessageService {

  @Override
  public void sendMessage(String s1, String s2) {
    System.out.println("Email sent to " + s2 + " with message: " + s1);
  }
}
