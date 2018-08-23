import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

  @Test
  void sum() {
    Sum sumObj= new Sum();
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5));
    Assertions.assertEquals(10, sumObj.sum(list));
  }

  @org.junit.jupiter.api.Test
  void sumIfEmpty() {
    Sum sumObj = new Sum();
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList());
    Assertions.assertEquals(0, sumObj.sum(list));
  }

  @org.junit.jupiter.api.Test
  void sumOneElement() {
    Sum sumObj= new Sum();
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2));
    Assertions.assertEquals(2, sumObj.sum(list));
  }

  @org.junit.jupiter.api.Test
  void sumNull() {
    Sum sumObj= new Sum();
    Assert.assertEquals(0,sumObj.sum(null));
  }


}