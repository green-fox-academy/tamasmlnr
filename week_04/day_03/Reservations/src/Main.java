public class Main {

  public static void main(String[] args) {

    Reservation reservation = new Reservation();

    for (int i = 0; i < 8; i++) {
      System.out.println(reservation.getFullReservation());
    }

  }
}
