public class Plant {
  double waterLevel;
  String color;
  boolean needsWatering;

  public Plant(String color) {
    waterLevel = 0;
    this.color = color;
  }

  public boolean needsWatering() {
    return needsWatering;
  }

  public double getWaterLevel() {
    return waterLevel;
  }


  public void waterPlant(double waterLevel) {
    this.waterLevel += waterLevel;
  }

  public void needsWater() {
    this.needsWatering=false;
  }

  public String getColor() {
    return color;
  }
}
