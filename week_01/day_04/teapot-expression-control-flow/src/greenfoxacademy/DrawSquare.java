package greenfoxacademy;

import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = Integer.parseInt(reader.nextLine());
    for (int i=0;i<num;i++)
    {
      System.out.print("%");
    }
    System.out.print("\n");
    for (int i = 2; i < num; i++) {
      System.out.print("%");
      for (int x = 2; x < num; x++) {
        System.out.print(" ");
      }
      System.out.println("%");
    }
    for (int i=0;i<num;i++)
    {
      System.out.print("%");
    }
  }
}
