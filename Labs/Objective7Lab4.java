// Write a program that sums up the numbers 1 -> 20 1 + 2 + 3 ... + 20 using a while loop.
//
// Create a class structure with the name Objective7Lab4.
// Create a main method.
// Create two variables to store the current sum total and a counter.
// Write a while loop.
// Use the count variable to have the loop execute 20 times.
// Increment the value of count with each iteration.
// Update the current sum by adding count to sum with each iteration.
public class Objective7Lab4 {
  public static void main(String[] args) {
    int sumTotal = 0;
    int counter = 1;
    while (counter <= 20) {
      sumTotal+=counter;
      counter++;
    }
    System.out.println(sumTotal);
  }
}
// Expected Output
// 210
