package org.example;

public class DebuggingPractice {

    // Method to calculate the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        // System.out.println("Initial sum: " + sum); :: output was '0'

        //NullPointerException
        // numbers = null;  // will cause a NullPointerException when trying to use the array
        // fix NullPointerException by checking if numbers is null using a loop

        if (numbers != null) {
            // for (int number : numbers) {
            // Logic error: Start loop from 1 instead of 0
            for (int i = 0; i < numbers.length; i++) {  // Fixed loop start index
                sum += numbers[i];
            }
            return (double) sum / numbers.length;
        } else {
            throw new IllegalArgumentException("Input array is null");
        }
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        double average = calculateAverage(testArray);
        System.out.println("The average is: " + average);
    }
}

/** Used the debugger to set breakpoints, step through the code,
 * inspect variables, identify exceptions,
 * and fix errors by checking for null and correcting loop conditions.
 * Did the same for the loop and fixed it to start at index 0.
 */






