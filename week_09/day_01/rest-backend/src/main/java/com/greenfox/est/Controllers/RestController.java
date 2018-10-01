package com.greenfox.est.Controllers;


import com.greenfox.est.Models.DTOs.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number != null) {
      return new Doubling(number);
    }
    return new ErrorClass("Please provide an input!");
  }

  @GetMapping("/greeter")
  public Object greet(@RequestParam(value = "name", required = false) String name,
                      @RequestParam(value = "title", required = false) String title) {
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
    if (appendable != null) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new Append(appendable));
    }
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .build();
  }

  @PostMapping("/dountil/{action}")
  public Object dountil(@PathVariable(value = "action", required = false) String action, @RequestBody(required = false) Until until) {
    if (until == null) {
      return new ErrorClass("Please provide a number!");
    }
    return new DoUntil(action, until.getUntil());
  }

}
