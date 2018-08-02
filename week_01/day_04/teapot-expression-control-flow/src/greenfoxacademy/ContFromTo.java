package greenfoxacademy;

import java.util.Scanner;

public class ContFromTo {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter two number:");
    int num1 = Integer.parseInt(reader.nextLine());
    int num2 = Integer.parseInt(reader.nextLine());
    if (num2<=num1) {
      System.out.println("The second number should be bigger!"); }
    else {
      for(int i=num1; i<num2; i++){
        System.out.println(i);
      }
    }
  }
}
