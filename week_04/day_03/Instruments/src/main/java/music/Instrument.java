package main.java.music;

public abstract class Instrument {

  protected String name;

  public abstract void play();

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name=name;
  }

}


