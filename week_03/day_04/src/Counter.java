import java.util.Scanner;

public class Counter {
  //Write a recursive function that takes one parameter: n and counts down from n.
  public static void main(String[] args) {
    System.out.println(counter(6));
  }

  private static int counter(int n) {
    if (n == 1){
      return 1;
    } else {
      System.out.println(n);
      return counter(n - 1);
    }
  }
}