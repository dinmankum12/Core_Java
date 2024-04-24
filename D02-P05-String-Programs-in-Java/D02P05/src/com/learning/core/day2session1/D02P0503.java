package com.learning.core.day2session1;

public class D02P0503 {
    public static void main(String[] args) {
        String input = "abc";
        printSubsequences(input);
    }
 
    public static void printSubsequences(String str) {
        int n = str.length();
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder subsequence = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subsequence.append(str.charAt(j));
                }
            }
            System.out.print(subsequence + ", ");
        }
    }
}
