import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
  @Test
  public void useDecreasesInkAmount() {
    Sharpie sharpiered = new Sharpie("red", 100);
    sharpiered.use();
    assertEquals(50, sharpiered.inkAmount);
  }

  @Test
  public void countUsableWorksWithFullInk() {
    SharpieSet sharpies =new SharpieSet();
    Sharpie sharpie1=new Sharpie("red",100);
    Sharpie sharpie2=new Sharpie("blue",100);
    sharpies.add(sharpie1);
    sharpies.add(sharpie2);
    Assertions.assertEquals(2,sharpies.countUsable());
  }

  @Test
  public void countUsableWorksWithEmptyInk() {
    SharpieSet sharpies =new SharpieSet();
    Sharpie sharpie1=new Sharpie("red",100);
    Sharpie sharpie2=new Sharpie("blue",100);
    sharpies.add(sharpie1);
    sharpies.add(sharpie2);
    sharpie1.use();
    sharpie1.use();
    Assertions.assertEquals(1,sharpies.countUsable());
  }

  @Test
  public void removeTrashWorks() {
    SharpieSet sharpies =new SharpieSet();
    Sharpie sharpie1=new Sharpie("red",100);
    Sharpie sharpie2=new Sharpie("blue",100);
    sharpies.add(sharpie1);
    sharpies.add(sharpie2);
    sharpie1.use();
    sharpie1.use();
    Assertions.assertEquals(2,sharpies.getSize());
    sharpies.removeTrash();
    Assertions.assertEquals(1,sharpies.getSize());
  }






}