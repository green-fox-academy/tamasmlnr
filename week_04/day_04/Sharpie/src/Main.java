public class Main {
  public static void main(String[] args) {
    SharpieSet sharpies =new SharpieSet();
    Sharpie sharpie1=new Sharpie("red",100);
    Sharpie sharpie2=new Sharpie("blue",100);
    Sharpie sharpie3=new Sharpie("green",100);

    sharpies.add(sharpie1);
    sharpies.add(sharpie2);
    sharpies.add(sharpie3);
    System.out.println(sharpies.countUsable());
    sharpie1.use();
    sharpie1.use();
    System.out.println(sharpies.countUsable());
    sharpies.removeTrash();
    sharpies.printSize();

  }
}
