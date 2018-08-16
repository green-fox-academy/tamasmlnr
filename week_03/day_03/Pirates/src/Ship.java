import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Ship {
  ArrayList<Pirate> crew = new ArrayList<>();
  Pirate captain = new Pirate();

  public Ship() {
    ArrayList<Pirate> pirates = new ArrayList<>();
    this.crew = pirates;
    fillShip();
  }

  public void fillShip() {
    crew.add(captain);
    int crewNumber = (int) (Math.random() * 50);
    for (int i = 0; i < crewNumber; i++) {
      crew.add(new Pirate());
    }
  }


  public String toString() {
    String status = "The captain " + captain.status() + " and drank " + captain.rumMeter + " rums.\n";
    status += "The ship has a crew of " + crew.size() + " seadogs.";
    return status;
  }

  public int score() {
    int score = crew.size() - captain.rumMeter;

    return score;
  }

  public void lose() {

    for (int i = 0; i < (int) (Math.random() * crew.size()); i++) {
      crew.remove(crew.get((int) (Math.random() * crew.size())));
    }
  }

  public void party() {
    for (int i = 0; i < (int) (Math.random() * crew.size() * 20); i++) {
      crew.get((int) (Math.random() * crew.size())).drinkSomeRum();
    }

  }



  public boolean battle(Ship ship) {
    if (this.score() > ship.score()) {
      party();
      ship.lose();
      return true;

    }
    ship.party();
    lose();
    return false;
  }


}
