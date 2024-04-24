package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P0305 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int factorial = calculateFactorial(number);
        
        System.out.println("Factorial of " + number + " is " + factorial);
    }
    
    // Function to calculate factorial recursively
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
