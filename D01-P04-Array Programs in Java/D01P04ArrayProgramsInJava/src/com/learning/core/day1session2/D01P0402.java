package com.learning.core.day1session2;

public class D01P0402 {
    public static void main(String[] args) {
        int[] A1 = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
 
        // Compute sum from index 0 to 14
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += A1[i];
        }
        A1[15] = sum;
 
        // Compute average of all numbers
        double average = (double) sum / A1.length;
        A1[16] = (int) average;
 
        // Identify smallest value from the array
        int smallest = A1[0];
        for (int i = 1; i < A1.length; i++) {
            if (A1[i] < smallest) {
                smallest = A1[i];
            }
        }
        A1[17] = smallest;
 
        // Output the modified array
        for (int num : A1) {
            System.out.print(num);
        }
    }
}