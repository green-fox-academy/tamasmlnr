public class Main {

  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.add(new Flower("Yellow"));
    garden.add(new Flower("Purple"));
    garden.add(new Tree("Purple"));
    garden.add(new Tree("Orange"));

    garden.getStatus();
    garden.water(40);
    garden.getStatus();
    garden.water(70);
    garden.getStatus();

  }
}
