import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

  public static void main(String[] args) {
//  int[] numList = new int[]{3, 2, 7, 4, 5, 6, 7, 8};
    System.out.println(sumUntil( 5));
  }

  public static int sumUntil(int sumIndex) {
    int sum = 0;
    for (int i = 0; i <= sumIndex; i++) {
      sum += i;
    }
    return sum;
  }

}
