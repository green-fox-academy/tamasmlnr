import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  // Write a function that takes a filename as string,
  // then returns the number of lines the file contains.
  // It should return zero if it can't open the file, and
  // should not raise any error.
  public static void main(String[] args) {
    String file = "my-file.txt";
    try{
      Path filePath = Paths.get(file);
      List<String> textContent = Files.readAllLines(filePath);
      int result = textContent.size();
      System.out.println(result);
    }
    catch (IOException e) {
      System.out.println("0");
    }
  }

}