public class Tree extends Plant {
  String color;

  public Tree(String color) {
    super(color);
    this.dryLevel = 10;
    this.absorption = 0.4;
  }

  public void getStatus() {
    needsWater();
    if (needsWatering) System.out.println(super.color + " tree needs watering!");
    else System.out.println(super.color + " tree does not need watering.");
  }
}
