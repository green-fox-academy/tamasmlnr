import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number to decide if it' an Armostrong number:");
    String number = reader.nextLine();
    isArmstrongNumber(number);
  }

  private static void isArmstrongNumber(String numberAsString) {
    //splits the input to digits in an integer Array, squares and sums them, checks if it's equal to the input
    int thirdSum = 0;
    int initialNumber = Integer.valueOf(numberAsString);
    int[] nums = new int[numberAsString.length()];
    String[] numbers = numberAsString.split("");
    for (int i = 0; i < numbers.length; i++) {
      nums[i] = Integer.valueOf(numbers[i]);
    }
    for (int i = 0; i < nums.length; i++) {
      thirdSum += Math.pow(nums[i], numberAsString.length());
    }
    if (thirdSum == initialNumber) {
      System.out.println(numberAsString + " is an Armstrong number.");
    } else System.out.println(numberAsString + " is not an Armstrong number.");
  }

}
