package com.learning.core.day1session2;

import java.util.*;

public class D01P0404 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int k = scanner.nextInt();
 
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
 
        List<List<Integer>> result = combinations(nums, k);
        for (List<Integer> combination : result) {
            System.out.println(combination.toString().replaceAll("[\\[\\],]", ""));
        }
    }
 
    public static List<List<Integer>> combinations(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, k, 0, new ArrayList<>(), result);
        return result;
    }
 
    private static void backtrack(int[] nums, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
 
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}