package com.greenfoxacademy.messageservice.Service;

import org.springframework.stereotype.Service;

@Service
public class TwitterService implements MessageService {
  @Override
  public String sendMessage() {
    return "Sending Twitter message..";
  }
}
