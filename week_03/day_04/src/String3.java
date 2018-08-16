import java.util.Random;

public class String3 {
  // Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
  public static void main(String[] args) {
    String word="This example sux, next one please thanx";
    System.out.println(addStars(word));
  }

  private static String addStars(String word) {
    char first;
    if (word.length() < 1) {
      return word;
    }
    first = word.charAt(0);
    return first + "*" + addStars(word.substring(1));
  }
}

