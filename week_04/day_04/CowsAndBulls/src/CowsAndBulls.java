import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {
  private Random random = new Random();
  private int[] toBeGuessed = new int[4];
  private int counter = 0;
  private String numAsString = "";
  boolean inProgress = true;
  private ArrayList<String> CowBull;

  public CowsAndBulls() {
    this.CowBull = new ArrayList<String>();
    gameLogic();
  }

  public void gameLogic() {
    start();
    guess();
    fin();
  }

  public void start() {
    generateNum();
    System.out.println("The number has 4 digits. Enter your first guess!");
  }

  public void guess() {
    Scanner reader = new Scanner(System.in);
    while (counter <= 3) {
      int nextNum = Integer.parseInt(reader.nextLine());
      seeIfGuessed(nextNum);
      printStatus();
    }
  }

  public void fin() {
    System.out.println("The number was " + numAsString + ".");
    boolean inProgress = false;
    if (CowBull.contains("Bull")) System.out.println("You lose!");
    else System.out.println("You win!");

  }

  public void printStatus() {
    System.out.println("Guesses:" + (counter));
    System.out.println("Cows and bulls: " + CowBull);
  }

  public void generateNum() {
    for (int i = 0; i < 4; i++) {
      toBeGuessed[i] = random.nextInt(9);
      numAsString += toBeGuessed[i];
    }
  }

  public boolean seeIfGuessed(int input) {
    if (input == toBeGuessed[counter]) {
      counter++;
      CowBull.add("Cow");
      return true;
    } else {
      counter++;
      CowBull.add("Bull");
      return false;
    }
  }

}
