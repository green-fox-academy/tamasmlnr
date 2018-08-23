import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

  @Test
  public void returnApple() {
    Apples apple = new Apples();
    Assertions.assertEquals("Apple",apple.returnApple());
  }
}