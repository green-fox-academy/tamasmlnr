public class CompareLength {
  // - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`
  public static void main(String[] args) {
    int[] p1 = new int[]{1, 2, 3};
    int[] p2 = new int[]{4, 5};
    whichHasMore(p1, p2);
  }

  public static void whichHasMore(int[] first, int[] second) {
    if (first.length > second.length) {
      System.out.println("p1");
    } else if (second.length > first.length) System.out.println("p2");
    else System.out.println("p1=p2");
  }
}



