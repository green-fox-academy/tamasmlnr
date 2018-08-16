public class Refactorio {
  public static void main(String[] args) {
    System.out.println(factorio(10));
  }
  public static int factorio(int n) {
    if (n==1) return 1;
    return n*factorio(n-1);
  }
}
