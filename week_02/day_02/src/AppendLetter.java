import java.lang.reflect.Array;
import java.util.*;

public class AppendLetter {
  public static void main(String... args) {
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr", "rók");
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    System.out.println(appendA(far));
  }

  public static List<String> appendA(List<String> list) {
    ArrayList<String> resultList= new ArrayList<>();
    for (int i=0;i<list.size(); i++)
    {
     resultList.add(list.get(i)+"a");
    }
    return resultList;
  }

}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"