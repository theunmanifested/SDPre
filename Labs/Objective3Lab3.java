// Create a class structure with the name Objective3Lab3.
// Create a main method.
// Create 3 int variables first, second, and third.
// These three variables will each be a randomly selected number between 1 and 6
// Hint:
//
// To generate a random number between 1 and 6:
// 1 + (int)(Math.random() * 6)
public class Objective3Lab3 {
  public static void main(String[] args) {
    int first, second, third;
    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6);
    System.out.println(first + second + third);
  }
}
