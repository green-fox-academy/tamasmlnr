package com.greenfox.groot.Controller;


import com.greenfox.groot.Models.ErrorMessage;
import com.greenfox.groot.Models.GrootReply;
import com.greenfox.groot.Models.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<?> groot(@RequestParam(value = "message", required = false) String message) {
    if (message == null)
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("I am Groot!"));
    return ResponseEntity.status(HttpStatus.OK)
        .body(new GrootReply(message, "I am groot!"));
  }


}
