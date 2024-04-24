package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P0509 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        
        String replacedString = replaceSpaces(input);
        
        System.out.println("Output:");
        System.out.println(replacedString);
    }
    
    public static String replaceSpaces(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}
