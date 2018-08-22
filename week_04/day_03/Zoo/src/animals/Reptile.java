package animals;

import animals.Animal;

public class Reptile extends Animal {

  public Reptile(String name) {
    this.name=name;
  }
  @Override
  public String breed() {
    return "laying eggs";
  }


  @Override
  public String bodyCoveredBy() {
  return "scales";
  }

  @Override
  public String environent() {
    return "land and water";
  }


}
