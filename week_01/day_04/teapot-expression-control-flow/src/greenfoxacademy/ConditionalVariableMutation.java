package greenfoxacademy;

public class ConditionalVariableMutation {
  public static void main(String[] args) {
    double a = 24;
    int out = 0;
    if (out % 2 == 0) {
      out++;
    }


    System.out.println(out);


    int b = 13;
    String out2 = "";
    // if b is between 10 and 20 set out2 to "Sweet!"
    // if less than 10 set out2 to "Less!",
    // if more than 20 set out2 to "More!"
    if (b >= 10 && b <= 20) {
      out2 = "Sweet!";
    }
    if (b < 10) {
      out2 = "Less!";
    }
    if (b > 20) {
      out2 = "More!";
    }

    System.out.println(out2);


    int c = 123;
    int credits = 100;
    boolean isBonus = false;
    // if credits are at least 50,
    // and isBonus is false decrement c by 2
    if (c >= 50 && !isBonus) {
      c -= 2;
    }
    // if credits are smaller than 50,
    // and isBonus is false decrement c by 1
    if (c < 50 && !isBonus) {
      c--;
    }
    // if isBonus is true c should remain the same


    System.out.println(c);


    int d = 8;
    int time = 120;
    String out3 = "";
    // if d is dividable by 4
    // and time is not more than 200
    // set out3 to "check"
    if ((d % 4 == 0) && time <= 200) {
      out3 = "Check";
    }
    // if time is more than 200
    // set out3 to "Time out"

    else if (time > 200) {
      out3 = "Time out!";
    }
    // otherwise set out3 to "Run Forest Run!"
    else {
      System.out.println("Run Forest Run!");
    }


    System.out.println(out3);
  }
}