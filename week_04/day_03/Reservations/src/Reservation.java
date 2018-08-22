import java.util.Arrays;
import java.util.Random;

public class Reservation implements Reservationy {
  private Random random = new Random();
  private String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  private String alphabetAndNums = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

  @Override
  public String getDowBooking() {
    return daysOfWeek[random.nextInt(7)];
  }

  @Override
  public String getCodeBooking() {
    String randomText = "";

    for (int i = 0; i < 8; i++) {
      int r = random.nextInt(36);
      randomText += alphabetAndNums.charAt(r);
    }
    return randomText;
  }

  public String getFullReservation() {
    return "Booking# " + getCodeBooking() + " for " + getDowBooking();
  }

}