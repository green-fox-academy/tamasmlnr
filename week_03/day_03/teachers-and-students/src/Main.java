public class Main {

  public static void main(String[] args) {
    Student student = new Student();
    Teacher teacher = new Teacher();
//booleans here to check whether the students learned and the teachers answered methods ran
    student.question(teacher);
    System.out.println(teacher.answered);
    teacher.teach(student);
    System.out.println(student.learned);

  }
}
