package greenfoxacademy;

import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = Integer.parseInt(reader.nextLine());
    for(int i=1;i<=10;i++)
    {
      System.out.println(i + " * " + num + " = " + num*i);
    }
  }
}
