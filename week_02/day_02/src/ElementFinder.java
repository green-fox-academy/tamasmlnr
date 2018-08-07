import java.util.*;

public class ElementFinder {
  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(containsSevenTwo(arrayList));
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!

  }

  public static String containsSeven(ArrayList<Integer> input) {
    if (input.contains(7)) {
      return "Hoorray?";
    } else return "Noooo :(";
  }

  public static String containsSevenTwo(ArrayList<Integer> input) {
    for (int i = 0; i < input.size(); i++) {
    if (input.get(i).equals(7)) {
      return "Hoorray?";
    }
     }return "Noooo";
  }
}