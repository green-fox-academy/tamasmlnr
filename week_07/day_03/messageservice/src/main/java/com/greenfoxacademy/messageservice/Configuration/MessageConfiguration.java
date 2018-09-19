package com.greenfoxacademy.messageservice.Configuration;

import com.greenfoxacademy.messageservice.Service.EmailService;
import com.greenfoxacademy.messageservice.Service.MessageService;
import com.greenfoxacademy.messageservice.Service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageService messageService() {
    return new EmailService();
  }
}
