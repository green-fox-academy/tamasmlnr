import java.util.stream.IntStream;

public class Shifter implements CharSequence {
  private String string;
  private int num;

  public Shifter(String string, int num) {
    this.string = string;
    this.num = num;
  }

  public String shift() {
    String newString = "";
    newString += "" + string.charAt(num);
    for (int i = 0; i < this.num; i++) {
      newString += string.charAt(i);
    }
    for (int i = this.num + 1; i < string.length(); i++) {
      newString += string.charAt(i);

    }
    return newString;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    String shiftedString = shift();
    System.out.println(shiftedString);
    return shiftedString.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }
}
