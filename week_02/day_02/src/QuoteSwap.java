import java.lang.reflect.Array;
import java.util.*;

public class QuoteSwap {
  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap().

    // Also, print the sentence to the output with spaces in between.
    System.out.println(quoteSwap(list));
    // Expected output: "What I cannot create I do not understand."

  }

  public static String quoteSwap(ArrayList<String> input) {
    String temp = input.get(2);
    input.set(2, input.get(5));
    input.set(5, temp);
    String result = "";
    for (int i = 0; i < input.size(); i++) {
      result += input.get(i) + " ";
    }
    return result;
  }
}