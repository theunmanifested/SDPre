// Print the values 10 -> 1.
// Print the value of counter with each iteration.

public class Objective7Lab1 {
  public static void main(String[] args) {
    int counter = 10;

    while(counter > 0) {
      System.out.println(counter);
      counter = counter - 1; //this makes we count down
    }
  }
}

// Expected Output
// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
