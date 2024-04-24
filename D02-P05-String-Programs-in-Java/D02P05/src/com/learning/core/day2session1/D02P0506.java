package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P0506 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        
        System.out.println("Length of longest prefix which is also a suffix: " + longestPrefixSuffix(input));
    }
    
    public static int longestPrefixSuffix(String s) {
        int n = s.length();
        int[] lps = computeLPSArray(s);
        
        return lps[n - 1];
    }
    
    private static int[] computeLPSArray(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        return lps;
    }
}