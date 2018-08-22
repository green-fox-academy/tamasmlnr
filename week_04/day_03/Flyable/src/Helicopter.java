public class Helicopter implements Vehicle {
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
  }

  @Override
  public void brake() {
  this.speed-=10;
  }

  @Override
  public void refuel() {
  this.fuel-=10;
  }
}
