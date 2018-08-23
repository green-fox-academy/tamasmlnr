import java.util.ArrayList;

public class Sum {

  public int sum(ArrayList<Integer> input) {
    int sum = 0;
    for (int i = 0; i < input.size(); i++) {
      sum += input.get(i);
    }
    return sum;
  }
}
