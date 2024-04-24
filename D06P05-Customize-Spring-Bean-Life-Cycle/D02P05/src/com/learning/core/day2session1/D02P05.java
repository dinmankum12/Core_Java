package com.learning.core.day2session1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class D02P05 {
    public static void main(String[] args) {
        // Bootstrap the Spring core container using XML file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
 
        // Retrieve Cashier bean from the container
        Cashier cashier = (Cashier) context.getBean("cashierBean");
 
        // Test the checkout functionality
        ShoppingCart cart = new ShoppingCart(); // Assuming ShoppingCart class exists
        // Add items to the shopping cart
 
        try {
            cashier.checkout(cart);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        // Close the Spring context
        context.close();
    }
}
