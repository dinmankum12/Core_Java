package com.learning.core.day1session2;

import java.util.*;
import java.util.Scanner;

public class D01P0403 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
 
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
 
        Map<Integer, Integer> map = new HashMap<>();
 
        for (int i = N - 1; i >= 0; i--) {
            if (map.containsKey(arr[i])) {
                System.out.println(i);
                return;
            }
            map.put(arr[i], i);
        }
 
        System.out.println("-1"); // If no repeating element found
    }
}
