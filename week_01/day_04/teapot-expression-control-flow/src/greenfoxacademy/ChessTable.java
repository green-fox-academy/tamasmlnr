package greenfoxacademy;

import java.util.Scanner;

public class ChessTable {
  public static void main(String[] args) {
    System.out.println("How many chess rows?");
    Scanner reader = new Scanner(System.in);
    int rowNumber = Integer.parseInt(reader.nextLine());


    for (int i = 0; i < rowNumber; i++) {
      if (i % 2 == 0) {
        System.out.print(" ");
      }
      for (int x=0; x<Math.ceil(((double)rowNumber/2)); x++) {
      System.out.print("# ");}
      if (i % 2 != 0) {
        System.out.print(" ");
      }
      System.out.println("");
    }
  }
}
