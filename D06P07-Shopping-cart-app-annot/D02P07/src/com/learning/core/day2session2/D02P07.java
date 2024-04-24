package com.learning.core.day2session2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class D02P07 {
    public static void main(String[] args) {
        // Bootstrap the Spring core container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 
        // Retrieve beans from the context if needed
        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
 
        // Test functionalities
        shoppingCart.getItems();
        shoppingCart.addItem(new Object());
        shoppingCart.removeItem(new Object());
        shoppingCart.updateItem(new Object());
 
        // Close the context
        context.close();
    }
}
