// Take two numbers of type double and return the average.
// Print out the results.
// Hint: Make sure the return type of findAverage matches the data type of average
import java.util.Scanner;
public class Objective9Lab4 {
  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;

    System.out.print("Please give me a number: ");
		num1 = kb.nextDouble();
		System.out.print("Please give me another number: ");
		num2 = kb.nextDouble();

    double average = findAverage(num1, num2);
    System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);

    kb.close();

  }
  // Write/define the "findAverage" method here that returns the average of the two double inputs from user
  public static double findAverage(double userNum1, double userNum2) {
    double sum = (userNum1 + userNum2)/2;
    return sum;    
  }
}

// Expected Output
// Please give me a number: 5
// Please give me another number: 15
// The average of 5.0 and 15.0 is: 10.0
