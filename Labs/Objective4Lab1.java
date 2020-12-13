// Prompt the user to get input for all of the String variables using input.nextLine().
// Print the user's input to match the expected output using String concatenation.
// starter code
import java.util.Scanner;
public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    //TODO prompt the user to get input for all of the String variables.
    System.out.println("Please tell me your first name");
    fname = keyboard.nextLine();
    System.out.println("Please tell me your last name");
    lname = keyboard.nextLine();
    System.out.println("Please tell me your favorite animal");
    favoriteAnimal = keyboard.nextLine();
    System.out.println("Please tell me your favorite food");
    favoriteFood = keyboard.nextLine();
    System.out.println("Please tell me your favorite song");
    favoriteSong = keyboard.nextLine();
    //TODO print the output formatted to look like the expected output using String concatenation.
    System.out.println("My name is " + fname + " " + lname + ".");
    System.out.println("My favorite animal is the " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");
  }
}

// Expected Output
//   >> What is your first name?
//   >> John
//   >> What is your last name?
//   >> Doe
//   >> What is your favorite animal?
//   >> Lemur
//   >> What is your favorite food?
//   >> Tacos
//   >> What is your favorite song?
//   >> Twinkle Twinkle Little star
//   >> My name is John Doe.
//   >> My favorite animal is the Lemur.
//   >> My favorite food is Tacos.
//   >> My favorite song is Twinkle Twinkle Little Star.
