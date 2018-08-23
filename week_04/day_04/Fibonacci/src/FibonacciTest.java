import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

  @Test
  public void testFibonacci() {
    Fibonacci fibonacci = new Fibonacci();
    Assertions.assertEquals(0,fibonacci.calcFibonacci(0));
    Assertions.assertEquals(1,fibonacci.calcFibonacci(1));
    Assertions.assertEquals(8,fibonacci.calcFibonacci(6));
    Assertions.assertEquals(233,fibonacci.calcFibonacci(13));
  }

}