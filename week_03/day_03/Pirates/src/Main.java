public class Main {

  public static void main(String[] args) {
    Ship shipFace = new Ship();
    Ship shippy = new Ship();
    System.out.println(shipFace);
    System.out.println(shippy);
    shipFace.battle(shippy);
    if(shippy.battle(shipFace)) {
      System.out.println("Shippy wins!");}
      else
      System.out.println("Shipface wins!");
    System.out.println("Shipface:" +shipFace);
    System.out.println("Shippy:"+shippy);
  }
}
