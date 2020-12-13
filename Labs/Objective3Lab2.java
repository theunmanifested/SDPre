// Write a program that calculates the length of the hypotenuse of a right triangle.
// Create a class structure with the name Objective3Lab2.
// Create a main method.
// Create 3 double variables side1, side2, and hypotenuse.
//
// side1 will hold its respective side length.
// side2 will hold its respective side length.
// hypotenuse should be assigned the calculated hypotenuse length. Remember a2 + b2 = c2.
// Print out the hypotenuse.
//
// Hints:
//
// side1 * side1 is the equivalent of side12
// Math.sqrt() is a function available via the Java Math library.
// public static void main(String[] args){
//     double num = Math.sqrt(3 * 3);    //num => 3
//     double result = Math.sqrt(4) + Math.sqrt(9); //result => 2 + 3 => 5

public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;
    side1 = 5;
    side2 = 4;
    hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
    System.out.println(hypotenuse);
  }
}
