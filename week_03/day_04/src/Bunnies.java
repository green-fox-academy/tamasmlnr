public class Bunnies {
  // We have a number of bunnies and each bunny has two big floppy ears.
  // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

  public static void main(String[] args) {
    int bunnies = 32;
    System.out.println(howManyEars(bunnies));
  }

  private static int howManyEars(int bunnies) {
    if (bunnies == 0) {
      return 0;
    } else {
      return 2 + howManyEars(--bunnies);
    }
  }
}
