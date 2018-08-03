
import java.util.ArrayList;
import java.util.Collections;

public class Bubble {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `true` sort that list descending

    System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
    //  should print [5, 9, 12, 24, 34]
    System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]
  }


  public static ArrayList<Integer> bubble(int[] input) {
    ArrayList<Integer> result = new ArrayList();
    for (int number : input) {
      result.add(number);
    }
    Collections.sort(result);
    return result;
  }
  public static ArrayList<Integer> advancedBubble(int[] input, boolean isDescending) {
  ArrayList<Integer> result=bubble(input);
    if (isDescending = true) {
      Collections.reverse(result);
    }

    return result;
  }

}