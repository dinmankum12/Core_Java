package com.learning.core.day3session1;

import java.util.HashSet;

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
 
public class D03P0702 {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();
 
        // Predefined information of 4 products
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));
 
        // List all the Product details
        for (Product product : products) {
            System.out.println(product.getProductId() + " " + product.getProductName());
        }
    }
}
