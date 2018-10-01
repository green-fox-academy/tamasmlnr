package com.greenfox.est.Controllers;


import com.greenfox.est.Models.DTOs.*;
import com.greenfox.est.Repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  private LogRepository logRepository;

  @Autowired
  public RestController(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer number) {
    logRepository.save(new Log(LocalDateTime.now(), "/doubling", number.toString()));
    if (number != null) {
      return new Doubling(number);
    }
    return new ErrorClass("Please provide an input!");
  }

  @GetMapping("/greeter")
  public Object greet(@RequestParam(value = "name", required = false) String name,
                      @RequestParam(value = "title", required = false) String title) {
    logRepository.save(new Log(LocalDateTime.now(), "/greeter", "name" + "," + "title"));
    if (name == null) {
      return new ErrorClass("Please provide a name!");
    }
    if (title == null) {
      return new ErrorClass("Please provide a title!");
    }
    return new Greeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> doubling(@PathVariable(value = "appendable", required = false) String appendable) {
    logRepository.save(new Log(LocalDateTime.now(), "/appendable", appendable));

    if (appendable != null) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new Append(appendable));
    }
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .build();
  }

  @PostMapping("/dountil/{action}")
  public Object dountil(@PathVariable(value = "action", required = false) String action, @RequestBody(required = false) Until until) {
    logRepository.save(new Log(LocalDateTime.now(), "/dountil", action + "" + until.getUntil()
        .toString()));
    if (until == null) {
      return new ErrorClass("Please provide a number!");
    }
    return new DoUntil(action, until.getUntil());
  }

  @PostMapping("/arrays")
  public Object arrays(@RequestBody(required = false) ArrayHandler arrayHandler) {
    logRepository.save(new Log(LocalDateTime.now(), "/arrays", arrayHandler.getWhat()));
    if (arrayHandler == null) {
      return new ErrorClass("Please provide what to do!");
    }
    if (arrayHandler.getWhat()
        .equals("double")) {
      return new ArrayCalculatorDouble(arrayHandler.getNumbers());
    }
    return new ArrayCalculator(arrayHandler.getWhat(), arrayHandler.getNumbers());
  }

  @GetMapping("/log")
  public LogsAndLogCount logs() {
    return new LogsAndLogCount(logRepository.findAll());
  }

  @PostMapping("/sith")
  public Sith sith(@RequestBody Text text) {
    return new Sith(text.getText());
  }

}
