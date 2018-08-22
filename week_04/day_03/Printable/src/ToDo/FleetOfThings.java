package ToDo;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing milk = new Thing("Get milk");
    Thing obst = new Thing("Remove the obstacles");
    Thing stand = new Thing("Stand up");
    Thing eat = new Thing("Eat lunch");
    fleet.add(milk);
    fleet.add(obst);
    fleet.add(stand);
    fleet.add(eat);

    stand.complete();
    eat.complete();

    System.out.println(fleet);

    for (Thing t : fleet.listItems()) {
      t.printAllFields();
    }
  }
}