public class Station {
  int gasAmount=10000;

  public void refill(Car car) {
  car.refill();
  this.gasAmount=gasAmount-car.getCapacity();
  }

  public int getGasAmount() {
    return gasAmount;
  }
}
