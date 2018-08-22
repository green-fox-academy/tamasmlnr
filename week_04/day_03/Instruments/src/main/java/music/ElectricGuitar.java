package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this(6);
  }

  public ElectricGuitar(int stringNum) {
    this.setName("Electric Guitar");
    this.setNumberOfStrings(stringNum);
  }

  @Override
  public String sound() {
    return "Twangg";
  }
  @Override
  public void play() {
    System.out.println(this.getName()+", a " + this.getNumberOfStrings() + "-stringed instrument that goes " +sound());
  }
}
