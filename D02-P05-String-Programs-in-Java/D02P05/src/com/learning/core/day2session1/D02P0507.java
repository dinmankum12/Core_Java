package com.learning.core.day2session1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class D02P0507 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dictionary (one word per line, empty line to end input):");
        List<String> dictionary = readInput(scanner);
        
        System.out.println("Enter the pattern:");
        String pattern = scanner.nextLine();
        
        List<String> matchingStrings = findMatchingStrings(dictionary, pattern);
        
        System.out.println("Output:");
        for (String str : matchingStrings) {
            System.out.print(str + " ");
        }
    }
    
    private static List<String> readInput(Scanner scanner) {
        List<String> input = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            input.add(line);
        }
        return input;
    }
    
    public static List<String> findMatchingStrings(List<String> dictionary, String pattern) {
        List<String> matchingStrings = new ArrayList<>();
        
        for (String word : dictionary) {
            if (matchesPattern(word, pattern)) {
                matchingStrings.add(word);
            }
        }
        
        return matchingStrings;
    }
    
    private static boolean matchesPattern(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        
        for (int i = 0; i < word.length(); i++) {
            if (pattern.charAt(i) != '.' && pattern.charAt(i) != word.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}
