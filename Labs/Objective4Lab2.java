// Prompt the user to get input for all of the int and double variables. using input.nextInt() and input.nextDouble()
// Print the user's input to match the expected output using the int and double variables.

import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //TODO prompt the user to get input for all of the above int variables.
    System.out.println("Please tell me the value for the first integer");
    num1 = keyboard.nextInt();
    System.out.println("Please tell me the value for the second integer");
    num2 = keyboard.nextInt();
    System.out.println("Please tell me the value for the third integer");
    num3 = keyboard.nextInt();
    //TODO prompt the user to get input for all of the above double variables.
    System.out.println("Please tell me the value for the first double");
    dub1 = keyboard.nextDouble();
    System.out.println("Please tell me the value for the second double");
    dub2 = keyboard.nextDouble();
    System.out.println("Please tell me the value for third double");
    dub3 = keyboard.nextDouble();
    //TODO print the three ints and their sum.
    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
    //TODO print the three doubles and their sum.
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + (dub1 + dub2 + dub3));
  }
}

// Expected Output
//   >> Please enter the first whole number you would like to add.
//   >> 1
//   >> Please enter the second whole number you would like to add.
//   >> 7
//   >> Please enter the third whole number you would like to add.
//   >> 5
//   >> Please enter the first decimal number you would like to add.
//   >> 1.1
//   >> Please enter the second decimal number you would like to add.
//   >> 2.2
//   >> Please enter the third decimal number you would like to add.
//   >> 3.3
//   >> The sum of 1 + 7 + 5 = 13
//   >> The sum of 1.1 + 2.2 + 3.3 = 6.6
