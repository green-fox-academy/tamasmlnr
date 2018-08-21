import java.util.ArrayList;

public class Garden {
  private ArrayList<Plant> plants;

  public Garden() {
    plants = new ArrayList<Plant>();
  }

  public void add(Plant plant) {
    plants.add(plant);
  }

  public int gardenSize() {
    return plants.size();
  }

  public void getStatus() {
    for (Plant plant : plants) {

      if (plant instanceof Flower) {
        ((Flower) plant).getStatus();
      }
      if (plant instanceof Tree) {
        ((Tree) plant).getStatus();
      }

      System.out.println("water level: "+plant.getWaterLevel());
    }
  }

  public void water(int howMuchWater) {
    System.out.println("Watering with "+howMuchWater);
    for (Plant plant : plants) {
      if(plant instanceof Flower)
      plant.waterPlant((double)howMuchWater / gardenSize()*0.75);
      if(plant instanceof Tree)
        plant.waterPlant((double)howMuchWater / gardenSize()*0.4);
    }
  }

}

