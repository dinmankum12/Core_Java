package com.learning.core.day2session1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class D02P04 {
    public static void main(String[] args) {
        // Bootstrap the Spring core container using XML file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
 
        // First customer
        ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
        cart1.addItem(new Product("Product1"));
        cart1.addItem(new Product("Product2"));
 
        // Second customer
        ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");
        cart2.addItem(new Product("Product3"));
 
        // Print items in each cart
        System.out.println("Cart 1 Items: " + cart1.getItems());
        System.out.println("Cart 2 Items: " + cart2.getItems());
 
        // Close the context
        context.close();
    }
}
