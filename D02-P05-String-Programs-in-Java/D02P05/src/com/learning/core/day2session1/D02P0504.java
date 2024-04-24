package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P0504 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        int deletions = minDeletionsToPalindrome(input);
        System.out.println("Minimum number of deletions to make the string palindrome: " + deletions);
        scanner.close();
    }
 
    public static int minDeletionsToPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[0][n - 1];
    }
}