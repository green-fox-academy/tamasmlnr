public class Main {

  public static void main(String[] args) {
    Farm farm = new Farm();
    Animal cow = new Animal();
    Animal sheep = new Animal();
    Animal pig = new Animal();

    farm.add(cow);
    farm.add(sheep);
    farm.add(pig);
    pig.play();
    farm.slaughter();

  }
}
