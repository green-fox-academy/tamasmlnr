import java.util.ArrayList;

// What this does: numbers in the arrayList represent a person. (Person 1,2,3,4,..)
// Each round the people in even places get removed (people standing in the 2nd, 4th, etc. places)
// The function also checks who comes next after each round.
// If the last element int he ArrayList has the next turn, it gets moved to the front of the ArrayList and again every second one gets removed.
// If the first in the ArrayList has the next turn, the list stays at is and again every second one gets removed.

public class JosephusProblem {
  public static void main(String[] args) {
    int howManyPeople = 12;
    ArrayList<Integer> people = new ArrayList<>();
    for (int i = 0; i < howManyPeople; i++) {
      people.add(i + 1);
    }

    System.out.println(people);
    while ((people.size()) > 1) {
      people = removeEvens(people);
    }
    System.out.println("The winner is:" +people);
  }
  public static ArrayList<Integer> moveToFirst(ArrayList<Integer> people) {
    System.out.println("moving last element to first position");
    people.add(0, people.get(people.size() - 1));
    people.remove(people.size() - 1);
    System.out.println(people);
    return people;
  }


  public static ArrayList<Integer> removeEvens(ArrayList<Integer> people) {
    int i = 1;
    ArrayList<Integer> peopleCopy = (ArrayList<Integer>) people.clone();
    System.out.println("removing even positions");
    ArrayList<Integer> list = new ArrayList<>();
    for (int person : people) {
      if (i % 2 == 0) {
        list.add(person);
        System.out.println(person + " removed");
      }
      i++;
    }
    people.removeAll(list);
    System.out.println(people);
    int lastRemoved = list.get(list.size() - 1);
    System.out.println("last removed: " + lastRemoved);

    if (peopleCopy.indexOf(lastRemoved) + 1 != peopleCopy.size()) {
      peopleCopy.get(peopleCopy.indexOf(lastRemoved) + 1);
      moveToFirst(people);
    }
    return people;
  }
}



