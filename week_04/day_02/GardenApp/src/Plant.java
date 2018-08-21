public class Plant {
  int waterLevel;
  String color;
  boolean needsWatering;

  public Plant(String color) {
    waterLevel = 0;
    this.color = color;
  }

  public boolean needsWatering() {
    return needsWatering;
  }

  public int getWaterLevel() {
    return waterLevel;
  }


  public void waterPlants(Garden garden, int waterLevel) {
    waterLevel += waterLevel / garden.gardenSize();
  }

  public void needsWater() {
    this.needsWatering=false;
  }

  public String getColor() {
    return color;
  }
}
