package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P0303 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();
        
        // Check the grade based on the percentage
        if (percentage >= 60) {
            System.out.println("A Grade");
        } else if (percentage >= 45) {
            System.out.println("B Grade");
        } else if (percentage >= 35) {
            System.out.println("C Grade");
        } else {
            System.out.println("Fail");
        }
    }
}
