import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SharpieSet {

  ArrayList<Sharpie> sharpies= new ArrayList<>();

  public SharpieSet() {
    this.sharpies = sharpies;
  }

  public void add(Sharpie sharpie) {
    this.sharpies.add(sharpie);
  }

  public int countUsable() {
    int usable=0;
    for (Sharpie sharpie: sharpies) {
      if (sharpie.inkAmount>0) usable++;
    }
    return usable;
  }

  public void removeTrash() {
    for (Iterator<Sharpie> iterator = sharpies.iterator(); iterator.hasNext();) {
      Sharpie sharpie= iterator.next();
      if(sharpie.getInkAmount() == 0) {
        iterator.remove();
      }
    }
  }

  public void printSize() {
    System.out.println("Usable:" +sharpies.size());
  }

}
