// Print out "In method".
public class Objective9Lab2 {
  public static void main(String[] args) {
    System.out.println("In main");
    printMessage();
    System.out.println("In main");
  }
  public static void printMessage() {
    System.out.println("In method");
  }
}
// Expected Output
// In main
// In method
// In main
