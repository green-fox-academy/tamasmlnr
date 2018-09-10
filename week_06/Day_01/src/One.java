import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class One {
  //  Write a Stream Expression to get the even numbers from the following array:
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> evenNumbers = numbers.stream()
        .filter(x -> x % 2 == 0)
        .collect(toList());

    System.out.println(evenNumbers);

  }
}
