package com.greenfox.est.Controllers;


import com.greenfox.est.Models.DTOs.Doubling;
import com.greenfox.est.Models.DTOs.ErrorClass;
import com.greenfox.est.Models.DTOs.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    if (name != null && title != null) {
      return new Greeting(name, title);
    }
    if (name != null) return new ErrorClass("Please provide a name!");
    if (title != null) return new ErrorClass("Please provide a title!");
  }

}
