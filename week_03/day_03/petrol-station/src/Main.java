public class Main {

  public static void main(String[] args) {
    // Create Station and Car classes
    //Station
    //gasAmount
    //refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
    //Car
    //gasAmount
    //capacity
    //create constructor for Car where:
    //initialize gasAmount -> 0
    //initialize capacity -> 100

    Car car = new Car();
    Station station = new Station();

    System.out.println("Car: "+car.getGasAmount());
    System.out.println("Station: "+station.getGasAmount());



    station.refill(car);
    System.out.println("Car: "+car.getGasAmount());
    System.out.println("Station: "+station.getGasAmount());

  }
}
