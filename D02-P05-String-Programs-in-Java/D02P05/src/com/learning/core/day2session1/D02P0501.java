package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P0501 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
 
        // Display length of the string
        System.out.println("Length of the string: " + input.length());
 
        // Display string in uppercase
        System.out.println("Uppercase string: " + input.toUpperCase());
 
        // Check if the string is a palindrome
        if (isPalindrome(input))
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");
    }
 
    // Function to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
 
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}