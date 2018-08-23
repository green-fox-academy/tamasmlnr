import com.sun.deploy.util.StringUtils;

import java.util.HashMap;

public class CountLetters {
  public HashMap<Character, Integer> countLetters(String inputWord) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < inputWord.length(); i++) {
      String s = inputWord.charAt(i) + "";
      String temp=inputWord;
      int count = inputWord.length() - temp.replaceAll(s, "").length();
      map.put(inputWord.charAt(i), count);
    }
    return map;}
}

