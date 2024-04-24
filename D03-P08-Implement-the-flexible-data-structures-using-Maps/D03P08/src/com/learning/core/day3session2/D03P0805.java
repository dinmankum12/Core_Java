package com.learning.core.day3session2;

import java.util.*;

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
        return Objects.hash(name, price);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 &&
Objects.equals(name, car.name);
    }
 
    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}
 
public class D03P0805 {
    public static void main(String[] args) {
        TreeMap<Car, String> cars = new TreeMap<>();
        cars.put(new Car("Benz", 900000.0), "");
        cars.put(new Car("Audi", 600100.0), "");
        cars.put(new Car("Swift", 305000.0), "");
        cars.put(new Car("Bugatti", 80050.0), "");
 
        for (Car car : cars.keySet()) {
            System.out.println(car);
        }
    }
}
