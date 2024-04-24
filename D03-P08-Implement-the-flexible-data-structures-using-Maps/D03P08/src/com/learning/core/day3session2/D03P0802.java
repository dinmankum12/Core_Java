package com.learning.core.day3session2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class D03P0802 {
    public static void main(String[] args) {
        // Creating a HashMap to store phone book details
        Map<String, String> phoneBook = new HashMap<>();
 
        // Adding predefined information to the phone book
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293693311");
        phoneBook.put("Kathe", "7234560011");
 
        // Taking user input for the name to search
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name to search: ");
        String nameToSearch = scanner.nextLine();
 
        // Searching for the phone number
        String phoneNumber = phoneBook.get(nameToSearch);
 
        // Displaying the phone number if found, or indicating if not found
        if (phoneNumber != null) {
            System.out.println("Phone number for " + nameToSearch + ": " + phoneNumber);
        } else {
            System.out.println("No phone number found for " + nameToSearch);
        }
    }
}
