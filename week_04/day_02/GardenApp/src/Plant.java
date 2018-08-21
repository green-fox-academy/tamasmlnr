public class Plant {
  double waterLevel;
  String color;
  boolean needsWatering;
  double absorption;

  public Plant(String color) {
    waterLevel = 0;
    this.color = color;
    this.absorption = 1.0;
  }

  public boolean needsWatering() {
    return needsWatering;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public double getAbsorption() {
    return absorption;
  }

  public void waterPlant(double waterLevel) {
    this.waterLevel += waterLevel;
  }

  public void needsWater() {
    this.needsWatering = false;
  }

  public String getColor() {
    return color;
  }
}
