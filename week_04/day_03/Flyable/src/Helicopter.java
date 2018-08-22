public class Helicopter implements Vehicle, Flyable {
  private int speed=0;
  private int fuel=100;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  @Override
  public void accelerate() {
  this.speed+=10;
    System.out.println("Helicopter is speeding up..");
  }

  @Override
  public void brake() {
  this.speed-=10;
    System.out.println("Helicopter is slowing down..");
  }

  @Override
  public void refuel() {
  this.fuel-=10;
    System.out.println("Helicopter is getting some fuel..");
  }

  @Override
  public void fly() {
    System.out.println("...VRRRRRR..");
  }

  @Override
  public void land() {
    System.out.println("Vrrrrrr...");
  }

  @Override
  public void takeOff() {
    System.out.println("vvrrRRRR...");
  }
}
