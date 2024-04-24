package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P0502 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the number of vowels to count from the end: ");
        int n = scanner.nextInt();
 
        // Count vowels from the end of the string
        String lastNVowels = getLastNVowels(input, n);
 
        // Output the result
        if (lastNVowels.equals("Mismatch in Vowel Count")) {
            System.out.println("Mismatch in Vowel Count");
        } else {
            System.out.println("Last " + n + " vowels from the end: " + lastNVowels);
        }
    }
 
    // Function to count last n vowels of a string
    public static String getLastNVowels(String str, int n) {
        int vowelCount = 0;
        StringBuilder lastNVowels = new StringBuilder();
 
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                lastNVowels.insert(0, ch); // Insert at the beginning to maintain order
            }
            if (vowelCount == n) {
                return lastNVowels.toString();
            }
        }
 
        // If the number of vowels found is less than n
        if (vowelCount < n) {
            return "Mismatch in Vowel Count";
        }
        return lastNVowels.toString();
    }
}
