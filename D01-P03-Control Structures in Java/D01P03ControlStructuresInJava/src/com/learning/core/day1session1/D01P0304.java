package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P0304 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        
        // Loop to print the right angle triangle pattern
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}