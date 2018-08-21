public class Flower extends Plant {
  String color;

  public Flower(String color) {
    super(color);
    this.absorption = 0.75;
    this.dryLevel = 5.0;
  }

  public void getStatus() {
    needsWater();
    if (needsWatering) System.out.println(super.color + " flower needs watering!");
    else System.out.println(super.color + " flower does not need watering.");
  }
}
