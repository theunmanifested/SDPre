// Print the values 0 -> 20.
// Print the value of counter with each iteration.
// Add 1 to counter each iteration so your loop doesn't run forever. Hint If you get stuck in an infinite loop press CTRL + C
public class Objective7Lab2 {
  public static void main(String[] args) {
    int counter = 0;

    while(counter <= 20) {
      System.out.println(counter);
      counter++;
    }
  }
}

// Expected Output
// 0
// 1
// 2
// 3
// ... 20
