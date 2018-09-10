import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Seven {
  public static void main(String[] args) {
//    Write a Stream Expression to find the frequency of characters in a given string!


    String text = "Write a Stream Expression to find the frequency of characters in a given string!";

    Map<Character, Integer> frequencies = text.chars()
        .boxed()
        .collect(toMap(
            k -> Character.valueOf((char) k.intValue()),
            v -> 1,
            Integer::sum));

    System.out.println(frequencies);
  }
}
