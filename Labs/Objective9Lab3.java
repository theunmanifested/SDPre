// Write code in the commented areas of the while loop in the Starter Code that would print out the menu with the provided printMenu() method.
// Take a user's input
// Depending on the users choice, print out the correct message
import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      printMenu();
      selection = scanner.nextInt();
      if (selection == 1) {
        System.out.println("Hello Human");
        break;
      } else if (selection == 2) {
        System.out.println("Apples, Bananas, Coconuts");
        break;
      } else if (selection == 3) {
        System.out.println("Goodbye");
        break;
      }
    }
    scanner.close();
  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
// Expected Output
// _____Menu_____
// 1: Say Hello
// 2: List My favorite foods
// 3: Exit
//
// 1
// Hello Human
// _____Menu_____
// 1: Say Hello
// 2: List My favorite foods
// 3: Exit
//
// 2
// Apples, Bananas, Coconuts
// _____Menu_____
// 1: Say Hello
// 2: List My favorite foods
// 3: Exit
//
// 3
// Goodbye
