public class WarApp {
   public static void main(String[] args) {
      Armada firstArmada= new Armada();
      Armada secondArmada= new Armada();

     System.out.println("First armada:");
     System.out.println(firstArmada);
     System.out.println("Second armada:");
     System.out.println(secondArmada);
     System.out.println("Battle!");
      firstArmada.war(secondArmada);

     System.out.println("First armada:");
      System.out.println(firstArmada);
     System.out.println("Second ship:");
      System.out.println(secondArmada);
    }
  }




