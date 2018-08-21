public class Main {

  public static void main(String[] args) {
    Garden garden = new Garden();
    Flower yellowFlower = new Flower("Yellow");
    Flower purpleFlower = new Flower("Purple");
    Tree purpleTree = new Tree("Purple");
    Tree orangeTree = new Tree("Orange");
    garden.add(yellowFlower);
    garden.add(purpleFlower);
    garden.add(purpleTree);
    garden.add(orangeTree);

    garden.getStatus();
    garden.water(40);
    garden.getStatus();
    garden.water(70);
    garden.getStatus();

  }
}
