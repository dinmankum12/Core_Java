package com.learning.core.day3session2;

import java.util.Map;
import java.util.TreeMap;
 
class Car implements Comparable<Car> {
    private String name;
    private double price;
 
    public Car(String name, double price) {
this.name = name;
        this.price = price;
    }
 
    @Override
    public String toString() {
        return name + " " + price;
    }
 
    @Override
    public int hashCode() {
        return name.hashCode() + Double.hashCode(price);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
return Double.compare(other.price, price) == 0 && name.equals(other.name);
    }
 
    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}
 
public class D03P0808 {
    public static void main(String[] args) {
        TreeMap<Car, Double> treeMap = new TreeMap<>();
        treeMap.put(new Car("Bugatti", 80050.0), 80050.0);
        treeMap.put(new Car("Swift", 305000.0), 305000.0);
        treeMap.put(new Car("Audi", 600100.0), 600100.0);
        
        // Print initial data
        for (Map.Entry<Car, Double> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey());
        }
 
        // Remove the entry with the greatest key
        Car removedCar = treeMap.pollLastEntry().getKey();
        System.out.println("Removed: " + removedCar);
 
        // Get key-value mapping associated with the greatest key
        Map.Entry<Car, Double> greatestEntry = treeMap.lastEntry();
        System.out.println(greatestEntry.getKey().toString() + " " + greatestEntry.getValue());
 
        // Replace the value mapped by the specified key
        double newValue = 80050.0;
        Car keyToReplace = new Car("Reva", 0.0);
        treeMap.put(keyToReplace, newValue);
        System.out.println(keyToReplace);
    }
}
