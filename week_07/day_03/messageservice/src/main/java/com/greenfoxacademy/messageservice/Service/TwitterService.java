package com.greenfoxacademy.messageservice.Service;

import org.springframework.stereotype.Service;

public class TwitterService implements MessageService {
  public void sendMessage(String s1, String s2) {
    System.out.println("Twitter message sent to " + s2 + " with message: " + s1);
  }
}
