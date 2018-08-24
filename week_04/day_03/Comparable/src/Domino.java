import java.util.Arrays;

public class Domino implements Comparable {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  public int valueOne() {
    return values[0];
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }


  //does not work yet
  @Override
  public int compareTo(Object o) {
    int d = this.getValues()[0] - ((Domino) o).getValues()[0];
    if (d != 0) return d;
    else return this.getValues()[1] - ((Domino) o).getValues()[1];
  }
}