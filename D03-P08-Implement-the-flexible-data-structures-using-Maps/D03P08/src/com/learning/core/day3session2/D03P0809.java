package com.learning.core.day3session2;

import java.util.Hashtable;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;
 
    public Employee(int id, String name, String department, String designation) {
this.id = id;
this.name = name;
        this.department = department;
        this.designation = designation;
    }
 
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
return id == other.id;
    }
}
 
public class D03P0809 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> hashtable = new Hashtable<>();
        hashtable.put(101, new Employee(101, "John Doe", "IT", "Software Engineer"));
        hashtable.put(102, new Employee(102, "Jane Smith", "HR", "HR Manager"));
        hashtable.put(103, new Employee(103, "Alice Johnson", "Marketing", "Marketing Manager"));
        hashtable.put(104, new Employee(104, "Bob Brown", "Finance", "Financial Analyst"));
 
        // Verify if the Hashtable is empty
        System.out.println(hashtable.isEmpty());
    }
}