package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    this(4);
  }

  public Violin(int stringNum) {
    this.setName("Violin Guitar");
    this.setNumberOfStrings(stringNum);
  }

  @Override
  public String sound() {
    return "Screech";
  }

  @Override
  public void play() {
    System.out.println(this.getName()+", a " + this.getNumberOfStrings() + "-stringed instrument that goes" +sound());
  }
}
