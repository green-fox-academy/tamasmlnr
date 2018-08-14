public class Test {
  public static void main(String[] args) {
    String test="Mon Feb  5 10:47:12 2018   32.28.73.45   POST\n Mon Feb  5 10:47:12 2018   32.28.73.45   POST";
    String[] results=test.split("   ");
    for (int i=0;i< results.length;i++){
      System.out.println(results[i]);
      if(Character.isDigit(results[i].charAt(0))) {

      }
    }
  }
}
