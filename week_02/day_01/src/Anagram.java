import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {


  public static void main(String[] args) {
    System.out.println("Enter two strings and I'll let you know if they are anagrams:");
    Scanner reader = new Scanner (System.in);
    String stringOne=reader.nextLine();
    String stringTwo=reader.nextLine();

    ArrayList<Character> firstArray=new ArrayList<>();
    stringToChar(stringOne, firstArray);
    ArrayList<Character> secondArray=new ArrayList();
    stringToChar(stringTwo, secondArray);
    System.out.println(isAnagram(firstArray,secondArray));
  }
  public static ArrayList<Character> stringToChar(String input, ArrayList<Character> output) {
    for (int i=0; i<input.length(); i++){
      output.add(input.charAt(i));
    }
    return output;

  }

  public static boolean isAnagram(ArrayList<Character> arrayOne, ArrayList<Character> arrayTwo) {
    boolean x=false;
    for (int i=0; i<arrayOne.size(); i++){
    if (arrayOne.size()==(arrayTwo.size())&&arrayOne.get(i)==arrayTwo.get(i)) {
      x=true;
    }
    }
  return x;}
}
