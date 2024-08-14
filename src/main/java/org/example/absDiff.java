package org.example;

public class absDiff {
  public static void main(String[] args) {
      int n= 3;
     int absDiff = diff21(n);
     System.out.println(absDiff);
  }
    public static int diff21(int n) {
        int absDiff = Math.abs(n - 21);
        if (n > 21) {
            return 2 * absDiff;
        } else {
            return absDiff;
        }
    }
}

/** Create an integer variable named absDiff to store the absolute difference between n and 21.
 * Calculate this difference using the Math.abs function, which takes the expression (n - 21) as its parameter.
 * Then, using the if/else statement, create a method to determine the absolute difference between n and 21.
 * Calculate the absolute difference by subtracting 21 from n. If n is over 21, multiply the absolute difference by 2.
 * There will be separate return statements for each condition.
 */