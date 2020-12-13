// Take in the users age using input.nextInt() and store it in the age variable.
// Calculate what year the user was born in.
// Print out the calculated birthYear.
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();
    currentYear = 2020;

    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}

// Expected Output
// How old are you?
// 27
// You were born in 1990
