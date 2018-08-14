import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of the lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"


    File file = new File("C:\\Users\\Tamás\\greenfox\\tamasmlnr\\week_03\\my-file.txt");
    try {
      Scanner reader = new Scanner(file);
      while (reader.hasNextLine()) {
        System.out.println(reader.nextLine());
      }
    } catch (Exception e) {
      System.out.println("Unable to read file:" + file);
    }

  }
}