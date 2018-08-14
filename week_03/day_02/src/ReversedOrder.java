import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) throws IOException {
    // Create a method that decrypts reversed-order.txt
    Path filePath = Paths.get("reversed-order.txt");
    List<String> text = Files.readAllLines(filePath);
    removeDoble(text);
  }

  private static void removeDoble(List<String> text) {
    Collections.reverse(text);
    for (String lines: text) {
      System.out.println(lines);
    }
  }

}


