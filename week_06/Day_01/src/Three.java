import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Three {

  public static void main(String[] args) {

//    Write a Stream Expression to get the average value of the odd numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> doubled= numbers.stream()
        .filter(n->n>0)
        .map(n->n*n)
        .collect(Collectors.toList());

    System.out.println(doubled);

  }


}
