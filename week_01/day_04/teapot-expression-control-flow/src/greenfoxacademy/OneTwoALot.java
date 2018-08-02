package greenfoxacademy;

import java.util.Scanner;

public class OneTwoALot {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number, please:");
    int num = Integer.parseInt(reader.nextLine());
    if (num <= 0) {
      System.out.println("NOT ENOUGH");

    } else if (num == 1) {
      System.out.println("One");
    } else if (num == 2) {
      System.out.println("Two");
    } else if (num == 3) {
      System.out.println("Three");
    } else if (num > 3) {
      System.out.println("A lot");
    }
  }
}

