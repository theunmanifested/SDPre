// Write a program that sums up the numbers 1 -> 20 1 + 2 + 3 ... + 20 using a for loop.
//
// Create a class structure with the name Objective8Lab2.
// Create a main method.
// Create one variable to store the current sum total.
// Write a for loop.
// Increment the value of your control with each iteration.
// Update the current sum by adding your control variable to sum with each iteration.
public class Objective8Lab2 {
  public static void main(String[] args) {
    int currentSumTotal = 0;
    for (int i = 1; i <= 20; i++) {
      currentSumTotal += i;
    }
    System.out.println(currentSumTotal);
  }
}
// Expected Output
// 210
