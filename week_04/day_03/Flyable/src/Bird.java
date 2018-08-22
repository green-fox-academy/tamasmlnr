
public class Bird extends Animal implements Flyable {
  public Bird(String name) {
    this.name = name;
    this.legs = 2;
    this.cutenessFactor = 5;
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


  @Override
  public void fly() {
    System.out.println("Flap-flap-flap");
  }

  @Override
  public void land() {
    System.out.println("Bammmm");
  }

  @Override
  public void takeOff() {
    System.out.println("Swooooosh");
  }
}
