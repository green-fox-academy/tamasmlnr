import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

  @org.junit.jupiter.api.Test
  void countLetters() {
    CountLetters counter= new CountLetters();
//    HashMap<Character,Integer> h=counter.countLetters("aaabbbbbc");
    HashMap<Character,Integer> h= new HashMap<>();
    h.put('a',3);
    h.put('b',5);
    h.put('c',1);
//    Assertions.assertEquals(3,h.get('a')););
    Assertions.assertEquals(h,counter.countLetters("aaabbbbbc"));
  }
}