package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    this.setName("Bass Guitar");
    this.setNumberOfStrings(4);
  }

  public BassGuitar(int stringNum) {
    this.setName("Bass Guitar");
    this.setNumberOfStrings(stringNum);
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }

  @Override
  public void play() {
    System.out.println(this.getName()+", a " + this.getNumberOfStrings() + "-stringed instrument that goes" +sound());
  }
}
