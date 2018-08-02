package greenfoxacademy;

import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = Integer.parseInt(reader.nextLine());
  if (num%2==0) {
    //for loop 1
    for (int i = 1; i <= num / 2; i++) {
      for (int x = num; x > i; x--) {
        System.out.print(" ");
      }
      for (int x = 1; x < 2 * i; x += 1) {
        System.out.print("*");
      }
      System.out.println("\n");
    }
    //for loop 2
    for (int i = num/2; i > 0; i--) {
      for (int x = num; x > i; x--) {
        System.out.print(" ");
      }
      for (int x = 1; x < 2 * i; x += 1) {
        System.out.print("*");
      }
      System.out.println("\n");
    }
  }

  if (num%2==1) {
    //for loop 1
    for (int i = 1; i <= (num / 2)+1; i++) {
      for (int x = num; x > i; x--) {
        System.out.print(" ");
      }
      for (int x = 1; x < 2 * i; x += 1) {
        System.out.print("*");
      }
      System.out.println("\n");
    }
    //for loop 2
    for (int i = num/2; i > 0; i--) {
      for (int x = num; x > i; x--) {
        System.out.print(" ");
      }
      for (int x = 1; x < 2 * i; x += 1) {
        System.out.print("*");
      }
      System.out.println("\n");
    }
  }}
}
