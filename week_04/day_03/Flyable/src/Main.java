public class Main {

  public static void main(String[] args) {
    Helicopter helicopter = new Helicopter();
    helicopter.fly();
    helicopter.accelerate();
    helicopter.brake();
    helicopter.land();

    Bird bird = new Bird("Vili");
    bird.age = 2;
    bird.takeOff();
    bird.fly();
    bird.land();
  }
}
