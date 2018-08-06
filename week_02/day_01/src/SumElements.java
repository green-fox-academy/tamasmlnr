public class SumElements {
  public static void main(String[] args) {
    // - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element

    int[] r = new int[] {54, 23, 66, 12};
    printSecondThird(r);
  }

  public static void printSecondThird(int[] input ){
    int sum=0;
    sum+=input[1]+input[2];
    System.out.println(sum);
  }
}
