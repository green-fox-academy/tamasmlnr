public class String1 {
  // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
  public static void main(String[] args) {
  String word="This example sux, next one please thanx";
    System.out.println(xToY(word));
  }

  private static String xToY(String word) {
    if (word.lastIndexOf('x')==-1) {
      return word;
    }
    else return xToY((word.replace(word.charAt(word.lastIndexOf('x')),'y')));
  }
}
