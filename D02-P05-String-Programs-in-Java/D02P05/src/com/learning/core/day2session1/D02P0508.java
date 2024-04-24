package com.learning.core.day2session1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class D02P0508 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        
        System.out.println("Output:");
        if (canSplitIntoFourDistinctStrings(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static boolean canSplitIntoFourDistinctStrings(String s) {
        if (s.length() < 4) {
            return false;
        }
        
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        
        return set.size() >= 4;
    }
}
