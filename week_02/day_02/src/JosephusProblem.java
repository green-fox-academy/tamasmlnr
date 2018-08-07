import java.lang.reflect.Array;
import java.util.ArrayList;
// Does not work yet - I need to figure out the algorythm. Implemented the remove even / remove odd arraylist elements methods.
public class JosephusProblem {
  public static void main(String[] args) {
    int howManyPeople = 12;
    ArrayList<Integer> people = new ArrayList<>();
    for (int i = 0; i < howManyPeople; i++) {
      people.add(i + 1);
    }
    System.out.println(people);
    removeEvens(people);
    while ((people.size()) > 1) {
      if (howManyPeople % 2 == 1) {
        people = removeOdds(people);

      }
      if (howManyPeople % 2 == 0) {
        people = removeEvens(people);
      }
    }
  }

  public static ArrayList<Integer> removeOdds(ArrayList<Integer> people) {
    System.out.println("remove odds");
    int i = 0;
    ArrayList<Integer> list = new ArrayList<>();
    for (int person : people) {
      if (i % 2 == 0) {
        //it.remove();
        list.add(person);
        System.out.println(person + " removed");
      }
      i++;
    }
    people.removeAll(list);
    System.out.println(people);
    return people;
  }

  public static ArrayList<Integer> removeEvens(ArrayList<Integer> people) {
    int i = 1;
    System.out.println("remove evens");
    ArrayList<Integer> list = new ArrayList<>();
    for (int person : people) {
      if (i % 2 == 0) {
        //it.remove();
        list.add(person);
        System.out.println(person + " removed");
      }
      i++;
    }
    people.removeAll(list);
    System.out.println(people);
    return people;
  }
}


