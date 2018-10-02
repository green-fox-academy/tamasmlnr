package com.greenfox.groot.Controller;


import com.greenfox.groot.MixtapeService.MixtapeService;
import com.greenfox.groot.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

  private MixtapeService mixtapeService;

  @Autowired
  public GuardianController(MixtapeService mixtapeService) {
    this.mixtapeService = mixtapeService;
  }

  @GetMapping("/groot")
  public ResponseEntity<?> groot(@RequestParam(value = "message", required = false) String message) {
    if (message == null)
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("I am Groot!"));
    return ResponseEntity.status(HttpStatus.OK)
        .body(new GrootReply(message, "I am groot!"));
  }


  @GetMapping("/yondu")
  public ResponseEntity<?> yondu(@RequestParam(value = "distance", required = false) Double distance,
                                 @RequestParam(value = "time", required = false) Double time) {
    if (distance == null || time == null)
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Missing parameters!"));
    return ResponseEntity.status(HttpStatus.OK)
        .body(new YonduReply(distance, time));
  }

  @GetMapping("/awesome")
  public ResponseEntity<?> awesomeMix() {
    return ResponseEntity.status(HttpStatus.OK)
        .body(mixtapeService.findAllSongs());
  }

  @PutMapping("/awesome/add")
  public ResponseEntity<?> awesomeMixAddSong(@RequestParam(value = "author", required = false) String author,
                                             @RequestParam(value = "title", required = false) String title,
                                             @RequestParam(value = "genre", required = false) String genre,
                                             @RequestParam(value = "year", required = false) Integer year,
                                             @RequestParam(value = "rating", required = false) Double rating) {
    if (author.equals(null) || title.equals(null) || genre.equals(null) || year == 0 || rating == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Missing parameters!"));
    }
    mixtapeService.addSong(new Song(author, title, genre, year, rating));
    return ResponseEntity.status(HttpStatus.OK)
        .body("Success!");
    //for testing:
    //http://localhost:8080/awesome/add?author=Test&title=Test&genre=test&year=1990&rating=9.8
  }


}
