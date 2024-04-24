package com.learning.core.day2session2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
 
@Component
@Scope("singleton")
public class ShoppingCart {
 
    @Autowired
    private SomeDependency someDependency;
 
@Value("${some.property}")
    private String someProperty;
 
    public void getItems() {
        // Method implementation
    }
 
    public void addItem(Object item) {
        // Method implementation
    }
 
    public void removeItem(Object item) {
        // Method implementation
    }
 
    public void updateItem(Object item) {
        // Method implementation
    }
 
    // Initialization method
    @PostConstruct
    public void init() {
        // Initialization logic
    }
 
    // Destruction method
    @PreDestroy
    public void destroy() {
        // Destruction logic
    }
}
