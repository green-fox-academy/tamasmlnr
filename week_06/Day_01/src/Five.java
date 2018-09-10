import java.util.List;
import java.util.stream.Collectors;

//Write a Stream Expression to find the uppercase characters in a string!
public class Five {
  public static void main(String[] args) {
  String text="Write a Stream Expression to find the uppercase characters in a string!";

    List<Character> upperChrs= text.chars()
        .mapToObj(x->(char)x)
        .filter(Character::isUpperCase)
        .collect(Collectors.toList());


    System.out.println(upperChrs);
  }
}
