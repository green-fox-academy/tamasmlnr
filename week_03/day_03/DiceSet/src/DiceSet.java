import java.util.Arrays;

public class DiceSet {
  // You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    for (int dv : dices) {
      System.out.print(dv);
    }
    System.out.println("");
    return dices;

  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }


  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  //Careful while running, this will also print all sixes
  public static void main(String[] args) {
    DiceSet diceSet = new DiceSet();
    while (true) {
      int sixes = 0;
      for (int i = 0; i < 6; i++) {
        if (diceSet.getCurrent(i) == 6) {
          sixes++;
        }
      }
      if (sixes == 6) break;
      diceSet.roll();
      diceSet.getCurrent();
    }
  }
}