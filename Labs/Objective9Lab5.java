// Prompt the user for two numbers, both of type double (Parts 1 & 2)
// Using a switch, compare the user's choice to the different functions provided by these methods (Part 3):
// findSum
// findAverage
// calcTax
// Not a method, but include an option to Quit.
// Define the findAverage method (Part 4)
// Hint: Refer to your logic from Objective9Lab4
// Define the calcTax method (Part 5)
// Hint: Use a tax rate of 8.31%
// Hint: No need for a grand total, just the expected amount from taxes.

import java.util.Scanner;
// changed public class name to match the filename
public class Objective9Lab5 {
  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;
    // Part 1:
    // prompt the user to provide one number and store their input in num1
    System.out.println("Please give me a number:");
    num1 = kb.nextDouble();
    // Part 2:
    // Prompt the user for another number and store their input in num2
    System.out.println("Please give me another number:");
    num2 = kb.nextDouble();

  	while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();
      // Part 3:
      // Complete this switch, with each case calling one of the methods below,
      // then printing out the result (refer to "Expected Output" below)
			// Don't forget to account for a user accidentally inputting an invalid number!
      if (choice < 1 || choice > 4) {
        System.out.println("Invalid entry.  Please try again");
      }
			switch (choice) {
        case 1:
          answer = findSum(num1, num2);
          System.out.println(num1 + " + " + num2 + " = " + answer);
          break;
        case 2:
          answer = findAverage(num1, num2);
          System.out.println("The average of " + num1 + " and " + num2 + " is: " + answer);
          break;
        case 3:
          answer = calcTax(num1, num2);
          System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + answer);
          break;
        case 4:
          System.out.println("You've chosen to quit.");
          keepGoing = false;
          break;
      }
		}
		kb.close();
	}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}
  // Part 4:
  // Write a method named "findAverage" that takes two doubles as parameters,
  // and returns a double that represents the average of the two parameters.
  public static double findAverage(double x, double y) {
    double average = (x + y)/2;
    return average;
  }
	// Part 5:
  // Write a method named "calcTax" that also takes two doubles as parameters,
  // and returns a double that represents the amount of tax the user would have
  // to pay based on the total of the two parameters. Use a tax rate of 8.31%
  // (Not a grand total, just the total taxes.  Refer to "Expected Output")
  public static double calcTax(double x, double y) {
    double onlyTaxCalc = (x + y) * (0.0831);
    return onlyTaxCalc;
  }

}

// Expected Output
// Please give me a number: 2
// Please give me another number: 8
//
// ========= MENU =========
// |                      |
// |   1. Add Numbers     |
// |   2. Find Average    |
// |   3. Calculate Tax   |
// |   4. Exit            |
// |                      |
// ========================
//
// Which would you like to do? 1
// 2.0 + 8.0 = 10.0
//
// ========= MENU =========
// |                      |
// |   1. Add Numbers     |
// |   2. Find Average    |
// |   3. Calculate Tax   |
// |   4. Exit            |
// |                      |
// ========================
//
// Which would you like to do? 2
// The average of 2.0 and 8.0 is: 5.0
//
// ========= MENU =========
// |                      |
// |   1. Add Numbers     |
// |   2. Find Average    |
// |   3. Calculate Tax   |
// |   4. Exit            |
// |                      |
// ========================
//
// Which would you like to do? 3
// The amount in tax to be collected from a purchase of 2.0 and 8.0 is: 0.831
//
// ========= MENU =========
// |                      |
// |   1. Add Numbers     |
// |   2. Find Average    |
// |   3. Calculate Tax   |
// |   4. Exit            |
// |                      |
// ========================
//
// Which would you like to do? 5
// Invalid entry.  Please try again
//
// ========= MENU =========
// |                      |
// |   1. Add Numbers     |
// |   2. Find Average    |
// |   3. Calculate Tax   |
// |   4. Exit            |
// |                      |
// ========================
//
// Which would you like to do? 4
// You've chosen to quit.
