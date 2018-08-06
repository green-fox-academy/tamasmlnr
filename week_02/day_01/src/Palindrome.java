import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the word: ");
    String word = reader.nextLine();
    String result = createPalindrome(word);
    System.out.println(result);

  }

  public static String createPalindrome(String word) {
    char[] newArray = new char[word.length()];
    System.out.print(word);
    for (int i = 0; i < word.length(); i++) {
      newArray[word.length() - 1 - i] = word.charAt(i);
    }
    String result = "";
    for (char x : newArray) {
      result += x;
    }
    return result;
  }

}

