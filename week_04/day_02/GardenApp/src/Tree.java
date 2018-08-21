public class Tree extends Plant {
  String color;
  double absorption;

  public Tree(String color) {
    super(color);
  }

  public void needsWater() {
    super.needsWater();
    if (waterLevel <= 10) needsWatering = true;
    this.absorption=0.4;
  }

  public double getAbsorption() {
    return absorption;
  }

  public void getStatus() {
    needsWater();
    if (needsWatering) System.out.println(super.color + " tree needs watering!");
    else System.out.println(super.color + " tree does not need watering.");
  }


}
