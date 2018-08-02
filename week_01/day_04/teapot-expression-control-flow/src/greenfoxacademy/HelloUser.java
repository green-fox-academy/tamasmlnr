package greenfoxacademy;

import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    Scanner reader = new Scanner(System.in);
    System.out.println("What is thy name?");
    String name = reader.nextLine();
    System.out.println("Hello, " +name);
  }
}