public class Pirate {
  int intox;
  int rumMeter;
  boolean isDead=false;
  boolean hasParrot;

  public Pirate() {
    this.intox = 0;
    this.rumMeter = 0;
    this.isDead = false;
    this.hasParrot = true;
  }

  public void drinkSomeRum() {
    if (isDead) System.out.println("He's dead.");
    else {
      this.intox += 10;
      this.rumMeter += 1;
    }
  }

  public void howsItGoingMate() {
    if (isDead) System.out.println("He's dead.");
    else {
      if (rumMeter <= 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        this.intox = 0;
        this.rumMeter = 0;
      }
    }
  }

  public void die() {
    isDead = true;
  }
}

