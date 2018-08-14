import java.util.ArrayList;
import java.util.Scanner;
//To check all palindromes within a string, this program generates all substrings
// and prints them if they are equal to their reversed substrings.

public class PalindromeSearcher {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a string to search for palindromes: ");
    String word = reader.nextLine();
    allSubstrings(word);
  }

  public static void allSubstrings(String word) {
    for (int c = 0; c < word.length(); c++) {
      for (int i = 1; i <= word.length() - c; i++) {
        String sub = word.substring(c, c + i);
        printIfPalindrome(sub);
      }
    }
  }

  public static void printIfPalindrome(String sub) {
    if (sub.length() >= 3 && sub.equals(reverseWord(sub))) System.out.println(sub);
  }

  public static String reverseWord(String word) {
    String reversed = "";
    for (int i = 0; i < word.length(); i++) {
      reversed += word.charAt(word.length() - i - 1);
    }
    return reversed;
  }
}