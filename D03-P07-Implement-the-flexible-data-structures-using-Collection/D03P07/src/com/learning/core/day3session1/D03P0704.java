package com.learning.core.day3session1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
 
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
 
public class D03P0704 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        HashSet<Product> products = new HashSet<>();
 
        // Predefined information of 4 products
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));
 
        // Input product ID to remove
        System.out.println("Enter product ID to remove:");
        String productIdToRemove = scanner.nextLine();
 
        // Remove the product by ID
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(productIdToRemove)) {
                iterator.remove();
                break;
            }
        }
 
        // Output the remaining products
        for (Product product : products) {
            System.out.println(product.getProductId() + " " + product.getProductName());
        }
    }
}