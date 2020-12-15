import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    // Ask the user for number, and print if odd or even
    int userNum;
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter a number:");
    userNum = kb.nextInt();

    if (userNum % 2 == 0){
      System.out.println("The number is even");
    } else {
        System.out.println("The number is odd");
    }
  }
}

// Expected Output
// Please enter a number:
// 43
// The number is odd
