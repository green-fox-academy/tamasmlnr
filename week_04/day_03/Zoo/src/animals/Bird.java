package animals;

import animals.Animal;

public class Bird extends Animal {
  public Bird(String name) {
    this.name=name;
    this.legs=2;
    this.cutenessFactor=5;
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public String bodyCoveredBy() {
    return "feathers";
  }

  @Override
  public String environent() {
    return "air";
  }
}
