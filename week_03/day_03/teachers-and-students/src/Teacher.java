public class Teacher {
  boolean answered=false;

  public void teach(Student student) {
    student.learn();

  }

  public void answer() {
    answered=true;

  }


}
