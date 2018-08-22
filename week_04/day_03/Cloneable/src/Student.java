public class Student extends Person implements Cloneable {

  private String previousOrganization;
  private int skippedDays;


  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, i'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days.");
  }

  public Student clone() throws CloneNotSupportedException {
    return (Student)super.clone();
  }

  public void skipDays(int skip) {
    this.skippedDays += skip;
  }

}
