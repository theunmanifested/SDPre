// Print out the number 1 -> 20 stating while also stating if the number is odd or even.
// Write a for loop.
// Declare and initialize your control variable to 1.
// Add a conditional statement to make the loop execute 20 times.
// increment your control variable with each iteration.
// write your for loop body
// Write an if statement that determines if the number is even or odd, think (%) operator.
// Print out counter is even or is odd accordingly.
// Increment the value of counter with each iteration.
public class Objective8Lab3 {
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 0) {
        System.out.println(i + " is even");
      } else if ( i % 2 == 1){
        System.out.println(i + " is odd");
      }
    }
  }
}

// Expected Output
// 1 is odd
// 2 is even
// 3 is odd
// ...
// 18 is even
// 19 is odd
// 20 is even
