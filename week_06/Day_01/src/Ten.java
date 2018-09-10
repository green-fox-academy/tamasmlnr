import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ten {
  public static void main(String[] args) {
//    Create a Fox class with 3 properties(name, type, color)
// Fill a list with at least 5 foxes, it's up to you how you name/create them!
// Write a Stream Expression to find the foxes with green color!
// Write a Stream Expression to find the foxes with green color and pallida type!

    List<Fox> foxes = Arrays.asList(
        new Fox("Béla", "Green", "Pallida"),
        new Fox("Józsi", "Red", "Alopex"),
        new Fox("Feri", "Red", "Vulpes"),
        new Fox("Árpi", "Grey", "Pallida"),
        new Fox("Pista", "Green", "Alopex"));

    System.out.println(foxes);

    List<Fox> greenFoxes = foxes.stream()
        .filter(p -> p.getColor() == "Green")
        .collect(Collectors.toList());

    System.out.println(greenFoxes);

    List<Fox> greenPallidaFoxes = foxes.stream()
        .filter(p -> p.getColor() == "Green")
        .filter(p -> p.getType() == "Pallida")
        .collect(Collectors.toList());

    System.out.println(greenPallidaFoxes);


  }
}
