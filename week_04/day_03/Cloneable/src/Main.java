public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {
    Student Jon = new Student("John", 20, "Male", "BME");
    Student clone = (Student) ((Student) Jon).clone();
    clone.introduce();
  }
}
