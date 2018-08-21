import java.util.ArrayList;

public class Carrier {

  private ArrayList<Aircraft> aircrafts;
  private int ammoStore;
  private int health;

  public Carrier(int ammoStore, int health) {
    this.aircrafts = new ArrayList<Aircraft>();
    this.ammoStore = ammoStore;
    this.health = health;
  }

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public int totalAmmoNeeded() {
    int totalAmmo = 0;
    for (Aircraft aircraft : aircrafts) {
      totalAmmo += aircraft.getMaxAmmo();
    }
    return totalAmmo;
  }

  public void fill() throws Exception {
    System.out.println("Refilling..");
    if (ammoStore == 0) throw new Exception("The ammo store is empty!");
    if (ammoStore >= totalAmmoNeeded()) {
      for (Aircraft aircraft : aircrafts) {
        ammoStore = aircraft.refill(ammoStore);
      }
    } else {
      for (Aircraft aircraft : aircrafts) {
        if (aircraft.isPriority()) {
          ammoStore = aircraft.refill(ammoStore);
        }
      }
    }
  }

  public void fight(Carrier enemyCarrier) {
    System.out.println("Fight!");
    health -= enemyCarrier.totalDamage();
    enemyCarrier.health = this.totalDamage();
    if (health <= 0) {
      System.out.println("It's dead, Jim :(");
    }
  }

  public int totalDamage() {
    int totalDamage = 0;
    for (Aircraft aircraft : aircrafts) {
      totalDamage += aircraft.totalDamage();
    }
    return totalDamage;
  }

  public void getStatus() {
    System.out.println("HP: " + health + ", Aircraft count:" + aircrafts.size() + ", Ammo storage: " + ammoStore + ", Total damage: " + totalDamage());
    System.out.println("Aircrafts:");
    for (Aircraft aircraft : aircrafts) {
      System.out.println(aircraft.getStatus());
    }
  }

}
