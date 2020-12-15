// Write an if/else statement that determines if string1 is equivalent to string3.
// Print out the findings. ie Banana is equal to Banana or Banana is not equal to Banana

public class Objective5Lab2 {
  public static void main(String[] args) {
    String string1 = "Banana";
    String string2 = "Bacon";
    String string3 = "Banana";

    if(string1.equals(string2)) {
      System.out.println(string1 + " is equivalent to " + string2);
    }
    else {
      System.out.println(string1 + " is not equivalent to " + string2);
    }

    if (string1.equals(string3)) {
      System.out.println(string1 + " is equivalent to " + string3);
    } else {
      System.out.println(string1 + " is not equivalent to " + string3);
    }
  }
}

// Expected Output
// Banana is not equivalent to Bacon
// Banana is equivalent to Banana
