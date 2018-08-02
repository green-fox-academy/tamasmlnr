package greenfoxacademy;

import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int sum=0;
    System.out.println("Enter how many integers you want to enter:");
    int howMany=Integer.parseInt(reader.nextLine());
    System.out.println("Enter "+howMany+" integers:");

    for(int i=0; i<howMany; i++)
    {
      sum+=Integer.parseInt(reader.nextLine());
    }
    System.out.println("Sum: " +sum + ", average: " + sum/howMany);

  }
}
