package greenfoxacademy;

import java.util.Scanner;

public class DrawPyramind {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = Integer.parseInt(reader.nextLine());
    for (int i=1;i<=num;i++) {
      for (int x = num; x > i; x--) {
        System.out.print(" ");
      }
      for (int x = 1; x < 2*i; x+=1) {
        System.out.print("*");
      }
      System.out.println("\n");
    }
  }
}
