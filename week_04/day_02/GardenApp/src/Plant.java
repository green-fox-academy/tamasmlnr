public class Plant {
  double waterLevel;
  String color;
  boolean needsWatering;
  double absorption;
  double dryLevel;

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

  public double getAbsorption() {
    return absorption;
  }

  public void waterPlant(double waterLevel) {
    this.waterLevel += waterLevel;
  }

  public void needsWater() {
    if (this.dryLevel >= this.waterLevel)
      this.needsWatering = true;
    else this.needsWatering = false;
  }

  public String getColor() {
    return color;
  }
}
