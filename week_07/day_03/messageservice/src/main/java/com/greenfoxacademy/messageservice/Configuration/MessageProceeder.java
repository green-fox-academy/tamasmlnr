package com.greenfoxacademy.messageservice.Configuration;

import com.greenfoxacademy.messageservice.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class MessageProceeder {
  @Autowired
  MessageService messageService;

  public void processMessage(String s, String s1) {

  }



}
