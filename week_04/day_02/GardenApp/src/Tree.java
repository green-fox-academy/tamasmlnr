public class Tree extends Plant {
  String color;

  public Tree(String color) {
    super(color);
  }

  public void needsWater() {
    super.needsWater();
    if (waterLevel <= 10) needsWatering = true;
  }

  public void getStatus() {
    needsWater();
    if (needsWatering) System.out.println(super.color + " tree needs watering!");
    else System.out.println(super.color + " tree does not need watering.");
  }


}
