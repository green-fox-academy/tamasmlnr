public class THird {
  public static void main(String[] args) {
// - Create an array variable named `q`
//   with the following content: `[4, 5, 6, 7]`
// - Print the third element of `q`
    int[] q = new int[]{4, 5, 6, 7};
    printEveryThird(q);

  }

  public static void printEveryThird(int[] input) {
    for (int i = 1; i < input.length; i++) {
      if (i % 3 == 0) {
        System.out.println(input[i - 1]);
      }
    }
  }

}
