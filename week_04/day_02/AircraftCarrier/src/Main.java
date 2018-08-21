public class Main {

  public static void main(String[] args) {
    F16 f16 = new F16();
    System.out.println(f16.getStatus());
    f16.refill(20);
    System.out.println(f16.getStatus());
  }
}
