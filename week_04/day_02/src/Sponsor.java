public class Sponsor extends Person {

  private String company;
  private int hiredStudents;

  public Sponsor() {
    super();
    this.company="Google";
    this.hiredStudents=0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company=company;
  }

  public void introduce() {
    System.out.println( "Hi, i'm " +getName() +", a " + getAge() +" year old " +getGender()+" who represents "+this.company+" and hired "+ hiredStudents+" students so far.");
  }


  public void hire(){
    hiredStudents+=1;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }


}
