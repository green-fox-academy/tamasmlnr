import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ship {
  ArrayList<Pirate> crew = new ArrayList<>();
  Pirate captain = new Pirate();

  public Ship(ArrayList<Pirate> pirates) {
    this.crew = pirates;
  }

public void fillShip() {
  crew.add(captain);
  int crewNumber=(int)Math.random()*20;
  for (int i=0;i<crewNumber) {
    crew.add(new Pirate());
  }
}

}
