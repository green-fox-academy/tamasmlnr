import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) throws IOException {
    // Create a method that decrypts encoded-lines.txt

    Path filePath = Paths.get("encoded-lines.txt");
    List<String> text = Files.readAllLines(filePath);
    removeDoble(text);
  }

  private static void removeDoble(List<String> text) {
    String alphabet="abcdefghijklmnopqrstuvwxyz[ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    for (String lines : text) {

      for (int i = 0; i < lines.length(); i++) {
//        System.out.println(lines.charAt(i));
        if (alphabet.indexOf(lines.charAt(i))>=0)
        System.out.print(alphabet.charAt(alphabet.indexOf(lines.charAt(i)-1)));
        else System.out.print(" ");

      }
    }
  }
}