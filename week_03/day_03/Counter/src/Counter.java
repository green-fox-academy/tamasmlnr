public class Counter {
  int value;
  int originalValue;

  public Counter() {
    this.value = 0;
  }

  public Counter(int value) {
    this.value = value;
    this.originalValue=value;
  }

  public void add(int addValue) {
    this.value += addValue;
  }

  public void add() {
    this.value += 1;
  }

  public int get() {
    return value;
  }

  public void reset() {
    this.value=originalValue;
  }

}
