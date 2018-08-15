public class Student {
  boolean learned=false;

  public void learn() {
    learned=true;
  }

  public void question (Teacher teacher) {
    teacher.answer();
  }

}

