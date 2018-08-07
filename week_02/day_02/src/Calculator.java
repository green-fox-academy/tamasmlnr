import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    Scanner reader = new Scanner(System.in);
    System.out.println("Please type in the expression:");
    String userInput = reader.nextLine();
    System.out.println(calculate(userInput));
  }

  public static int calculate(String input) {
    //takes the user input string, splits it into the operand string and the two integers, doTheMaths calculates the result
    String[] characters = input.split(" ");
    String operand = characters[0];
    int firstNumber = Integer.valueOf(characters[1]);
    int secondNumber = Integer.valueOf(characters[2]);
    int result = doTheMaths(operand, firstNumber, secondNumber);
    return result;
  }

  public static int doTheMaths(String operand, int firstNumber, int secondNumber) {
    if (operand.equals("+")) {
      return firstNumber + secondNumber;
    }
    if (operand.equals("-")) {
      return firstNumber - secondNumber;
    }
    if (operand.equals("*")) {
      return firstNumber * secondNumber;
    }
    if (operand.equals("/")) {
      return firstNumber / secondNumber;
    }
    if (operand.equals("%")) {
      return firstNumber % secondNumber;
    }
    return 0;
  }

}