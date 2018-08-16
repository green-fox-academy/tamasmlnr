import java.util.ArrayList;

public class Armada {

  ArrayList<Ship> armada = new ArrayList<>();


  public Ship getShip(int n) {
    return this.armada.get(n);
  }

  public void war(Armada enemyArmada) {
    while (true) {
      armada.get(0).battle(enemyArmada.getShip(0));
      if (loss() == true) {
        System.out.println("Armada one wins!");
        break;
      }
      if (enemyArmada.loss() == true) {
        System.out.println("Armada two wins!");
        break;
      }
    }
  }

  public boolean loss() {
    for (int i = 0; i < armada.size(); i++) {
      if (armada.get(i).score() == 0) {
        return true
      } ;
      return false;
    }
  }
}
