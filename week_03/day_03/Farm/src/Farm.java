import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Farm {
  ArrayList<Animal> animals = new ArrayList<>();
  final int capacity = 5;

  public Farm() {
    this.animals = animals;
  }

  public void add(Animal animal) {
    animals.add(animal);
  }

  public void breed() {
    if (animals.size() < capacity) {
      animals.add(new Animal());
    }
  }

  public void printAll() {
    for (Animal animal : animals) {
      System.out.println(animal.toString());
    }
  }

  public void slaughter() {
    int indexOfHungriest = 0;
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i).getHunger() < animals.get(indexOfHungriest).getHunger()) {
        indexOfHungriest = i;
      }
    }
    animals.remove(indexOfHungriest);
  }

}
