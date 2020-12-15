// Take in a number from the user.
// Determine if the number is greater than, less than, or equal to 0.
// Print the findings.
import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    // ask the user for a number
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int userNum = kb.nextInt();
    // check if equal, lesser or greater than zero and print result
    if (userNum == 0) {
      System.out.println("The number is zero");
    } else if (userNum > 0) {
      System.out.println("The number is postive");
    } else {
      System.out.println("The number is negative");
    }
  }
}

// Expected Output
// Please enter a number:
// 3
// The number is positive
