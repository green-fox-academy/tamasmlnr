package greenfoxacademy;

import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int x = 5;
    int guess = 0;
    System.out.println("Guess the number:");
    while (guess != x) {
      guess = Integer.parseInt(reader.nextLine());
      if (guess < x) {
        System.out.println("The stored number is higher");
      }
      if (guess > x) {
        System.out.println("The stored number is lower");
      }
    }
    System.out.println("You found the number: " + x);
  }
}

