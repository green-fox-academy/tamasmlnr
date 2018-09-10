public class Fox {
  private String name;
  private String color;
  private String type;

  public Fox(String name, String color, String type) {
    this.name = name;
    this.color = color;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public String getType() {
    return type;
  }

  public String toString() {
    return this.getName();
  }

}
