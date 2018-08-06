import java.util.Arrays;
import java.util.Collections;

public class Reverse {
  // - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
  public static void main(String[] args) {
    Integer[] aj={3,4,5,6,7};
    Collections.reverse(Arrays.asList(aj));

    for (int j = 0; j < aj.length; j++) {
      System.out.print(aj[j] + " ");
    }
  }
}
