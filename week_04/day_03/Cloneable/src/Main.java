public class Main {

  public static void main(String[] args) {
    Student Jon = new Student("John", 20, "Male", "BME");
    Student clone = null;
    try {
      clone = (Jon).clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    clone.introduce();
  }
}
