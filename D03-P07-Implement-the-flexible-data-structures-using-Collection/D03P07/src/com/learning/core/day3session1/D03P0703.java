package com.learning.core.day3session1;

import java.util.HashSet;
import java.util.Scanner;
 
class Product {
    private String productId;
    private String productName;
 
    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
 
    public String getProductId() {
        return productId;
    }
 
    public String getProductName() {
        return productName;
    }
}
 
public class D03P0703 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        HashSet<Product> products = new HashSet<>();
 
        // Predefined information of 4 products
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));
 
        // Input product ID to search
        System.out.println("Enter product ID to search:");
        String searchProduct = scanner.nextLine();
 
        // Search for the product
        boolean found = false;
        for (Product product : products) {
            if (product.getProductId().equals(searchProduct)) {
                found = true;
                break;
            }
        }
 
        // Output
        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}
