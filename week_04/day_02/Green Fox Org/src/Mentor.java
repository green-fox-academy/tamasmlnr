import java.util.HashMap;

public class Mentor extends Person {
  String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name,age,gender);
    this.level=level;
  }

  public Mentor(){
    super();
    this.level="intermediate";
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println( "Hi, i'm " +getName() +", a " + getAge()+" year old " +getGender()+" " +this.level+" mentor." ) ;
  }

}
