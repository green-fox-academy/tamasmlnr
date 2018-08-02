package greenfoxacademy;


import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    Scanner reader = new Scanner(System.in);
    System.out.println("How many kilometers?");
    int km = Integer.parseInt(reader.nextLine());
    System.out.println(km +" km is " + km*1.60934 + " miles.");

  }
}