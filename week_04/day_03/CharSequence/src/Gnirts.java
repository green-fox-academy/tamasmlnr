import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  String string;

  public Gnirts(String string) {
    this.string = string;
  }

  public String revert(String string) {
    this.string = new StringBuilder(string).reverse().toString();
    return this.string;
  }

  @Override
  public int length() {
    return 0;
  }

  public char charAt(int index) {
    String revertedString = revert(this.string);
    System.out.println(revertedString);
    return revertedString.charAt(index);
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
