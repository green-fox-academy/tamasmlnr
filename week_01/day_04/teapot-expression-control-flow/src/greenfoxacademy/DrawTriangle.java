package greenfoxacademy;

import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = Integer.parseInt(reader.nextLine());
    for (int i=1;i<=num;i++) {
      for (int x = 0; x < i; x++) {
        System.out.print("*");
      }
      System.out.println("\n");
    }
  }
}
