public class WarApp {
   public static void main(String[] args) {
      Ship shipFace = new Ship();
      Ship shippy = new Ship();
      System.out.println(shipFace);
      System.out.println(shippy);
      shipFace.battle(shippy);

      System.out.println(shipFace);
      System.out.println(shippy);
    }
  }



}
