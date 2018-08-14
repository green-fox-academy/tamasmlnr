import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
  public static void main(String[] args) {
    Path path = Paths.get("log.txt");
    try {
      uniqueIp(path);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  private static void uniqueIp(Path path) throws IOException {
    String[] ip=new String[100];
    List<String> content = Files.readAllLines(path);
    for (int i=0;i<content.size();i++)
      for (int j=0;j<content.size();j++){
        ip=content.get(i).split("8  ");
    }


  }

}
