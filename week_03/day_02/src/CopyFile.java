import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    String copyFrom="my-file.txt";
    String copyTo="my-file-copy.txt";
    copyTo(copyFrom,copyTo);
  }

  public static void copyTo (String copyFrom, String copyTo) {
  Path fromPath= Paths.get(copyFrom);
  Path toPath=Paths.get(copyTo);
    try {
      Files.copy(fromPath,toPath);
    } catch (IOException e) {

    }
  }
}
