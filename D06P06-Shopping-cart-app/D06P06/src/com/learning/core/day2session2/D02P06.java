package com.learning.core.day2session2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class D02P06 {
    public static void main(String[] args) {
        // Load the Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 
        // Retrieve the ShoppingCart bean from the context
        ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingCart");
 
        // Test the methods of the ShoppingCart class
        shoppingCart.getItems();
        shoppingCart.addItem(new Object());
        shoppingCart.removeItem(new Object());
        shoppingCart.updateItem(new Object());
    }
}
