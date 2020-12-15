// The following code simulates a menu system.
// Using the Starter Code below add code to the commented areas that would:
// Inside of the endless loop write if statements to determine if 1, 2, or 3 was selected.
// If 1 was pressed print Hello World
// If 2 was pressed print a String of your favorite foods Apple, Banana, Coconut.
// If 3 was pressed break the loop.
import java.util.Scanner;
public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

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
}

// NOTE: The instructions and the Expected Output do not match, so I used the latter 

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
