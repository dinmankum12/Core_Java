package com.learning.core.day1session2;
import java.util.Scanner;
public class D01P0401 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int[] array = {7, 25, 5, 19, 30};
 
        System.out.println("Enter two numbers in the range from 1 to 40:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
 
        if (checkBingo(num1, num2, array)) {
            System.out.println("It's Bingo");
        } else {
            System.out.println("Not Found");
        }
    }
 
    public static boolean checkBingo(int num1, int num2, int[] array) {
        for (int i : array) {
            if (i == num1 && i == num2) {
                return true;
            }
        }
        return false;
    }
}