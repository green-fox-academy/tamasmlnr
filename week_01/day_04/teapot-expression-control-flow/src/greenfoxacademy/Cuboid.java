package greenfoxacademy;

public class Cuboid {
  public static void main(String[] args) {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
    double a=10.0;
    double b=20.0;
    double c=30.0;
    System.out.println("Surface area: "+ (int)(2*(a*b+a*c+b*c)));
    System.out.println("Volume: "+(int)(a*b*c));

  }
}
