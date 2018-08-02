package greenfoxacademy;

import java.util.Scanner;

public class PrintBigger {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter two number, please:");
    int num1 = Integer.parseInt(reader.nextLine());
    int num2 = Integer.parseInt(reader.nextLine());
    if (num1>num2) {
      System.out.println("The bigger number is " +num1);

    }
    else System.out.println("The number is " +num2);
  }
}
