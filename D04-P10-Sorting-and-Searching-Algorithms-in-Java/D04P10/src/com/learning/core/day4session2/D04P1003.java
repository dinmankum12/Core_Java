package com.learning.core.day4session2;

import java.util.Scanner;

public class D04P1003 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the element to search:");
        int key = scanner.nextInt();
        
        if (linearSearch(arr, key)) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is not Present");
        }
        
        scanner.close();
    }
    
    public static boolean linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
