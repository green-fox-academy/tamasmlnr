import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class lottery {

  public static void main(String[] args) throws IOException {
    // Create a method that find the 5 most common lottery numbers in lottery.csv

    Path filePath = Paths.get("lottery.txt");
    List<String> text = Files.readAllLines(filePath);
    commonNumbers(text);

  }

  private static void commonNumbers(List<String> text) {

    ArrayList<String> numbersList = new ArrayList();

    for (String lines : text) {
      numbersList.add(lines.substring(lines.lastIndexOf("t") + 2, lines.length()));
    }
    List<Integer> result = new ArrayList<Integer>();
    for (String words : numbersList) {
      words = words.replace(" ", ";");
      String[] numbersArray = words.split(";");
      for (String number : numbersArray) {
        result.add(Integer.parseInt(number));
      }
    }
    System.out.println(result);
    ArrayList<Integer> oneToNinety= new ArrayList<>();
    //New array of 90
    int x=0;
    for (int i=0;i<90;i++) {
      oneToNinety.add(i);
    }
    for (int i=1;i<90;i++) {
      for (int j=0;j<5;j++) {

        x= countHowMany(oneToNinety.get(i), result);

        System.out.println(x);
    }};


    }
    public static int countHowMany(int numberToCount, List<Integer> input) {
    int counter=0;
    for (int numbers: input) {
      if (numbers==numberToCount) counter++;

    }return counter;
    }




  }


