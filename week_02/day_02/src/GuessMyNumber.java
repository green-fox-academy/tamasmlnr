import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int randomNum = generateRandom(reader);
    guesser(randomNum, reader);
  }

  public static int generateRandom(Scanner reader) {
    System.out.println("What is the highest number for the random?");
    int max = Integer.parseInt(reader.nextLine());
    int randomNumber = (int) (Math.random() * max);
    System.out.println("I've the number between 1-" +max +". You have 5 lives.");
    return randomNumber;
  }

  public static void guesser(int numberToGuess, Scanner reader) {
    int lives = 5;

    while (true) {
      int guess = Integer.parseInt(reader.nextLine());
      if (guess < numberToGuess) {
        lives -= 1;
        System.out.println("Too low. You have " + lives + " lives left.");
      }
      if (guess > numberToGuess) {
        lives -= 1;
        System.out.println("Too high. You have " + lives + " lives left.");
      }
      if (guess == numberToGuess) {
        System.out.println("Congratulations. You won!");
        break;
      }
      if (lives == 0) {
        System.out.println("You lost. But do not get disappointed, life goes on and there is so much beauty in it. \nLosing one game does not mean you are worthless. Learning how to lose sometimes feel better than winning. So embrace it!");
      }
    }
  }
}
