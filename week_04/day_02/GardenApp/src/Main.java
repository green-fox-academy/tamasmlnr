public class Main {

  public static void main(String[] args) {
    Garden garden = new Garden();
    Flower yellowFlower = new Flower("yellow");
    Flower purpleFlower = new Flower("purple");
    Tree purpleTree = new Tree("purple");
    Tree orangeTree = new Tree("orange");
    garden.add(yellowFlower);
    garden.add(purpleFlower);
    garden.add(purpleTree);
    garden.add(orangeTree);

    garden.getStatus();




  }
}
