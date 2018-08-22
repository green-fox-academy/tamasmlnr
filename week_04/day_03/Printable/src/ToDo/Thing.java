package ToDo;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  public void printAllFields() {
    if (completed) System.out.println("Done:" +name);
    else System.out.println("To be done:" + name);
  }
}