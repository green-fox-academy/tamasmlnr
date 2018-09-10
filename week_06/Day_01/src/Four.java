import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Four {
//  Write a Stream Expression to find which number squared value is more then 20 from the following array:
public static void main(String[] args) {
  ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

  List<Integer> doubled= numbers.stream()
      .filter(n->n>0)
      .map(n->n*n)
      .filter(n->n>20)
      .collect(Collectors.toList());

  System.out.println(doubled);

}
  }
