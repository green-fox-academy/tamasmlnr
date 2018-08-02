package greenfoxacademy;

import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = Integer.parseInt(reader.nextLine());
    for (int i=0;i<num;i++)
    {
      System.out.print("%");
    }
    System.out.print("\n");
    for (int i = 0; i < num-2; i++) {
      System.out.print("%");
      for (int y=0;y<i;y++)
      {
        System.out.print(" ");
      }
      System.out.print("#");
      for (int x = num-2; x > i+1; x--) {
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
