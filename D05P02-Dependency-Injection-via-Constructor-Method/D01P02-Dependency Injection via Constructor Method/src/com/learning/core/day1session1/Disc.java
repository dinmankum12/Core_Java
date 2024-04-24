package com.learning.core.day1session1;

public class Disc extends Product {
    private int capacity;
 
    public Disc(String name, double price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }
 
    // Getters and setters
    public int getCapacity() {
        return capacity;
    }
 
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}