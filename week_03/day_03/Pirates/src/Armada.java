import java.util.ArrayList;

public class Armada {

  ArrayList<Ship> armada = new ArrayList<>();

  public Armada() {
    this.armada = new ArrayList<Ship>();
    fillWithShip(armada);
  }

  public void fillWithShip(ArrayList<Ship> armada) {
    for (int i = 0; i < Math.random() * 50; i++) {
      Ship newShip = new Ship();
      armada.add(newShip);
    }
  }

  public String toString() {
    return "The armada has " + this.armada.size() + " ships and " + this.getScore() + " points.";
  }

  public Ship getShip(int n) {
    return this.armada.get(n);
  }

  public int getScore() {
    int sum = 0;
    for (Ship ship : armada) {
      sum += ship.score();
    }
    return sum;
  }

  public void war(Armada enemyArmada) {

    while (true) {
      for (int i = 0; i < armada.size(); i++) {
        armada.get(i).battle(enemyArmada.getShip(i));
        for (int x = 0; x < armada.size(); i++) {
          if (armada.get(x).score() < 1) {
            armada.remove(x);
          }


        }
        if (loss() == true) {
          System.out.println("Armada one wins!");
          break;
        }
        if (enemyArmada.loss() == true) {
          System.out.println("Armada two wins!");
          break;
        }
        armada.get(0).battle(enemyArmada.getShip(0));
      }

    }
  }

//  public boolean loseShip() {
//    for (int i = 0; i < armada.size(); i++) {
//      if (armada.get(i).score() == 0) {
//        return true;
//      }
//    }
//    return false;
//  }

  public boolean loss() {
    if (armada.size() == 0) {
      return true;
    }
    return false;
  }

}



