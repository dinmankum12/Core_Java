package com.learning.core.day1session1;

public class Battery extends Product {
    private boolean rechargeable;
 
    public Battery(String name, double price, boolean rechargeable) {
        super(name, price);
        this.rechargeable = rechargeable;
    }
 
    // Getters and setters
    public boolean isRechargeable() {
        return rechargeable;
    }
 
    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}