import java.util.ArrayList;
import java.util.Arrays;

public class ToDoPrint {
  public static void main(String... args) {
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo


    String toDoList = "My to do list: \n";
    String games = " - Download games \n";
    String diablo = "  -  Diablo \n";

    todoText = toDoList + todoText + games + diablo;
    System.out.println(todoText);
  }
}