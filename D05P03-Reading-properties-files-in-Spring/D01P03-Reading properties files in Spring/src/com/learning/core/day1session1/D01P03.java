package com.learning.core.day1session1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 
        Product product = (Product) context.getBean("product");
        Battery battery = (Battery) context.getBean("battery");
        Disc disc = (Disc) context.getBean("disc");
 
        // Test the shopping cart
        // Add products and apply discounts
    }
}
