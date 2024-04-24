package com.learning.core.day4session1;

import java.util.Stack;

public class D04P0903 {
    public static int evaluateExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int sign = 1; // 1 for positive, -1 for negative
 
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
 
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                result += sign * num;
                i--;
            } else if (ch == '+') {
                sign = 1;
            } else if (ch == '-') {
                sign = -1;
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
        String expression = "10+246";
        int result = evaluateExpression(expression);
        System.out.println("Output: " + result);
    }
}
