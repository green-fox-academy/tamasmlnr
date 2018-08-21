public class Aircraft {
  private int damage;
  private int maxAmmo;
  private int ammo;
  private String type;
  private boolean isPriority;

  public Aircraft(int damage, int maxAmmo, String type, boolean isPriority) {
    this.damage = damage;
    this.maxAmmo = maxAmmo;
    this.ammo = 0;
    if (type == "F16") {
      this.type = "F16";
    }
    if (type == "F35") {
      this.type = "F35";
    }
    this.isPriority = isPriority;
  }


  public Aircraft() {
  }

  public int fight() {
    int dmg = ammo * damage;
    ammo = 0;
    return dmg;
  }

  public int refill(int refillAmount) {
    int refillLeft = refillAmount - maxAmmo;
    ammo = maxAmmo;
    return refillLeft;

  }

  public String getType() {
    return type;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public boolean isPriority() {
    return isPriority;
  }

  public int totalDamage() {
    return this.ammo * this.damage;
  }

  public String getStatus() {
    return "Type " + this.type + ", Ammo " + this.ammo + ", Base damage: " + this.damage + ", All damage:" + totalDamage();
  }
}
