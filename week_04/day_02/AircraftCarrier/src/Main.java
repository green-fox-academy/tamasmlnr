public class Main {

  public static void main(String[] args) throws Exception {
    F16 f16 = new F16();
    F16 f16_2 = new F16();

    F35 f35 = new F35();
    F35 f35_2 = new F35();
    System.out.println("Carrier 1");
    Carrier carrier = new Carrier(500, 500);
    carrier.add(f16);
    carrier.add(f16_2);
    carrier.getStatus();
    carrier.fill();
    carrier.getStatus();
    System.out.println("Carrier 2");
    Carrier carrier2 = new Carrier(500, 4000);
    carrier2.add(f35);
    carrier2.add(f35_2);
    carrier2.getStatus();
    carrier2.fill();
    carrier2.getStatus();


    carrier.fight(carrier2);
  }

}
