package com.learning.core.day3session1;

import java.util.ArrayList;
import java.util.Scanner;
 
public class D03P0701 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
 
        // Input list of student names
        System.out.println("Enter list of student names separated by spaces:");
        String input = scanner.nextLine();
        String[] names = input.split(" ");
        for (String name : names) {
            studentNames.add(name);
        }
 
        // Input name to search
        System.out.println("Enter the name to search:");
        String nameToFind = scanner.nextLine();
 
        // Check if the name exists in the ArrayList
        if (studentNames.contains(nameToFind)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
