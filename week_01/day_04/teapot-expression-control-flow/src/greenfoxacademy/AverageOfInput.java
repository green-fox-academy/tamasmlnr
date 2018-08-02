package greenfoxacademy;

import java.util.Scanner;

public class AverageOfInput {

  public static void main(String[] args) {
    Scanner reader= new Scanner(System.in);
    System.out.println("Enter five numbers:");
    int num1=Integer.parseInt(reader.nextLine());
    int num2=Integer.parseInt(reader.nextLine());
    int num3=Integer.parseInt(reader.nextLine());
    int num4=Integer.parseInt(reader.nextLine());
    int num5=Integer.parseInt(reader.nextLine());
    int sum=num1+num2+num3+num4+num5;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + sum/5);
  }

}
