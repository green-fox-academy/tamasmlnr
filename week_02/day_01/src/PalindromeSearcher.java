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
//        comment below would print out all substrings and their positions to help understand the process
//        System.out.print(c+" ");
//        System.out.println(i);
//        System.out.println(sub);
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


//I'll just leave this here for the future me to laugh at how bad I was


//  public static void isPalindrome(ArrayList<Character> letters) {
//    String returnPalindrome="";
//    boolean palindrome=false;
//    for (int x=1;x<letters.size(); x++){
//    for (int i=x; i<letters.size()-x;i++)
//    {
//      if(letters.get(i-x)==letters.get(i+x)) {
//        for(int y=i-x;y<=2*x;y++) {
//        returnPalindrome+=letters.get(y);
//
//        }          System.out.print(returnPalindrome);
//        System.out.println("");
//        returnPalindrome="";      } }}}}
//

  //Even earlier attempt - this almost worked
//  public static void isaPalindrome(ArrayList<Character> letters) {
//    String returnPalindrome = "";
//    boolean palindrome = false;
//    for (int x = 1; x < letters.size(); x++) {
//      for (int i = x; i < letters.size() - x; i++) {
//        if (letters.get(i - x) == letters.get(i + x)) {
//          for (int y = 1; y <= x; y++) {
//            returnPalindrome += letters.get(i - y);
//            returnPalindrome += letters.get(i);
//            returnPalindrome += letters.get(i + y);
//            System.out.println(returnPalindrome);
//            returnPalindrome = "";
//          }
//        }
//      }
//    }
//
//}
//}
//
  }