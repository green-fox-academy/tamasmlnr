package greenfoxacademy;

import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("How many girls?");
    int girls = Integer.parseInt(reader.nextLine());
    System.out.println("And how many boys?");
    int boys = Integer.parseInt(reader.nextLine());
    if ((girls+boys)>=20&&girls==boys) {
      System.out.println("The party is excellent!");
    }
    else if ((girls+boys)>=20&&girls!=boys) {
      System.out.println("Quite cool party!");
    }
    else if ((girls+boys)<20) {
      System.out.println("Average party..");
    }
    if ((girls==0&&boys>0)) {
      System.out.println("Sausage party..");
    }
  }
}
