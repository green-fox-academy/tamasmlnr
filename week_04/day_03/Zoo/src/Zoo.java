import animals.*;

public class Zoo {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile");
        Mammal mammal = new Mammal("Koala");
        Bird bird = new Bird("Parrot");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed() + " Their body is covered by " +reptile.bodyCoveredBy());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed() + " Their body is covered by " +mammal.bodyCoveredBy());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed() + " Their body is covered by " +bird.bodyCoveredBy());
    }
}