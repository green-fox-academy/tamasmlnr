import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    return Collections.max(Arrays.asList(a, b, c));
  }

  double median(List<Integer> pool) {
    Collections.sort(pool);
    if (pool.size() % 2 == 1) return pool.get((pool.size() - 1) / 2);
    else return ((double) pool.get(pool.size() / 2) + (double) pool.get(pool.size() / 2 - 1)) / 2;

  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i', 'A', 'E', 'I', 'O', 'U').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    if (length > 2) {
      for (int i = 0; i < length; i++) {
        char c = teve.charAt(i);
        if (isVowel(c)) {
          teve = String.join(c + "v" + c, teve.split("" + c));
          i += 2;
          length += 2;
        }
      }
      return teve;
    } else {
      return ""+teve.charAt(0)+teve.charAt(1)+'v'+teve.charAt(1);
    }
  }
}

