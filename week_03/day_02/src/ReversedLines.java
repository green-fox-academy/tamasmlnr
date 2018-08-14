import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) throws IOException {
    // Create a method that decrypts reversed-lines.txt
    Path filePath = Paths.get("reversed-lines.txt");
    List<String> text = Files.readAllLines(filePath);
    reverseLines(text);
  }

  private static void reverseLines(List<String> text) {
    for (String lines: text) {
      for (int i=lines.length()-1 ; i>0; i--) {
        System.out.print(lines.charAt(i));
      }
    }

  }
}



