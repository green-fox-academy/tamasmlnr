public class PrintAll {
  // - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`

  public static void main(String[] args) {
    int[] numbers= new int[] {4,5,6,7};
    for (int number: numbers){
      System.out.println(number);
    }
  }
}