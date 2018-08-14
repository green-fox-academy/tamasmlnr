import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) throws IOException {
    // Create a method that decrypts the duplicated-chars.txt
    Path filePath = Paths.get("duplicated-chars.txt");
    List<String> text = Files.readAllLines(filePath);
    removeDoble(text);
  }

  private static void removeDoble(List<String> text) {
    for (String lines: text) {
      for (int i=0;i<lines.length();i+=2) {
        System.out.print(lines.charAt(i));
      }
    }

  }
}



