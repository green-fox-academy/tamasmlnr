public class Fibonacci {
  public int calcFibonacci(int n) {

    if (n == 1) return 1;
    if (n == 0) return 0;

    else return calcFibonacci(n - 1) + calcFibonacci(n - 2);
  }

}
