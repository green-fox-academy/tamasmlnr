// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
public class Bunny2 {
  public static void main(String[] args) {
    int bunnies = 6;
    System.out.println(howManyEars(bunnies));
  }

  private static int howManyEars(int bunnies) {
    if (bunnies == 0) {
      return 0;
    } else {
      if (bunnies % 2 == 1)
        return 2 + howManyEars(--bunnies);
      else
        return 3 + howManyEars(--bunnies);
    }
  }

}
