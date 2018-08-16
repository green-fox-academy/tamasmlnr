public class Power {
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

  public static void main(String[] args) {
    System.out.println(powerN(2,5));
  }

  public static int powerN(int n, int power) {
    if (power==0) {
      return 1;
    }
    else return n*powerN(n,--power);
  }

}
