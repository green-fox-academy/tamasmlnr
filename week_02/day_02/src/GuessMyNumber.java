import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
   int max=generateRandom();
    System.out.println(max);
  }

  public static int generateRandom() {
    System.out.println("What is the highest number for the random?");
    Scanner reader = new Scanner(System.in);
    int max=Integer.parseInt(reader.nextLine());
    int randomNumber = (int) (Math.random() * max);
    return randomNumber;
  }
}
