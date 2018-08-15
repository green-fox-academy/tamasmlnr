//Create an Animal class
//Every animal has a hunger value, which is a whole number
//        Every animal has a thirst value, which is a whole number
//        when creating a new animal object these values are created with the default 50 value
//    Every animal can eat() which decreases their hunger by one
//    Every animal can drink() which decreases their thirst by one
//    Every animal can play() which increases both by one
public class Animal {
  int hunger;
  int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

  public void getHunger() {
    System.out.println("Hunger:" + hunger);
  }

  public void getThirst() {
    System.out.println("Thirst" + thirst);
  }

}
