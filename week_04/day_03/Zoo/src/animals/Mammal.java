package animals;

import animals.Animal;

public class Mammal extends Animal {

  public Mammal(String name) {
    this.name=name;
  }
  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }

  @Override
  public String bodyCoveredBy() {
    return "hair.";
  }

  @Override
  public String environent() {
    return "land";
  }
}
