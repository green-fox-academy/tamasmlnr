import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Eight {
  public static void main(String[] args) {
//    Exercise 8
//    Write a Stream Expression to find the frequency of numbers in the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    Map<Integer, Integer> frequencies = numbers.stream()
        .collect(toMap(
            n -> n,
            v->1,
            Integer::sum));

    System.out.println(frequencies);




  }
}
