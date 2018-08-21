public class Flower extends Plant {
  String color;
  public Flower(String color){
    super(color);
  }

  public void needsWater() {
    super.needsWater();
    if(waterLevel<=5) needsWatering=true;
  }

  public void getStatus() {
    needsWater();
    if (needsWatering) System.out.println(super.color + " flower needs watering!");
    else System.out.println(super.color + " flower does not need watering.");
  }


}
