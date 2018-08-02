package greenfoxacademy;

import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("How many chickens?");
    int chicken = Integer.parseInt(reader.nextLine());
    System.out.println("How many pigs?");
    int pig = Integer.parseInt(reader.nextLine());
    System.out.println("That would be " + (chicken*2+pig*4) + " legs in total.");
  }
}
