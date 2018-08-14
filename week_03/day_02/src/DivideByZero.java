public class DivideByZero {

  public static void main(String[] args) {
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

    int divideBy=0;

    try {
      System.out.println(10/divideBy);}
      catch (Exception e){
        System.out.println("Fail");
      }
  }

}
