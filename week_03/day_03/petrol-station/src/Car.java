public class Car {
  int gasAmount;
  int capacity;

  public Car() {
    this.gasAmount = 0;
    this.capacity = 100;
  }

  public void refill() {
  this.gasAmount=100;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getGasAmount() {
    return gasAmount;
  }
}
