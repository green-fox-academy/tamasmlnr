package greenfoxacademy;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number, please:");
    int num = Integer.parseInt(reader.nextLine());
    if (num%2==0) {
      System.out.println("The number is even.");

    }
    else System.out.println("The number is odd.");
  }
}
