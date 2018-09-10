import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Nine {
  public static void main(String[] args) {
    String text = "Write a Stream Expression to convert a char array to a string!";
    char[] charray = text.toCharArray();

    String newText = Stream.of(charray)
        .map(c -> String.valueOf(c))
        .collect(Collectors.joining());


    System.out.println(newText);

  }
}
