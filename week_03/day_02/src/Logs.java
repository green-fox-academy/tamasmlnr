import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Logs {
  // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
  public static void main(String[] args) {
    Path path = Paths.get("log.txt");
    try {
      List<String> content = Files.readAllLines(path);
      uniqueIp(content);
      System.out.println(postGetRatio(content));


    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static double postGetRatio(List<String> content) {
    int getCount = 0;
    int postCount = 0;
    for (String line : content) {
      if (line.contains("POST")) {
        postCount++;
      }
      if (line.contains("GET")) {

        getCount++;
      }

    }
    return (double) getCount / (double) postCount;
  }

  private static List<String> uniqueIp(List<String> inList) throws IOException {
    ArrayList<String> ip = new ArrayList();
    for (String line : inList) {
      ip.add(line.substring(27, 38));
    }
    Collections.sort(ip);
    List<String> uniqueIp = new ArrayList();
    for (int i = 0; i < ip.size(); i++)
      if (!uniqueIp.contains(ip.get(i))) {
        uniqueIp.add(ip.get(i));
      }
    return uniqueIp;
  }


}


