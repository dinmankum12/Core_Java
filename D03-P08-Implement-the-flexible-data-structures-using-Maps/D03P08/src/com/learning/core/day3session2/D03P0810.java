package com.learning.core.day3session2;

import java.util.*;

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
        return id + " " + name + " " + designation + " " + department;
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
return id == employee.id;
    }
}
 
public class D03P0810 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
 
        // Predefined employee details
        Employee emp1 = new Employee(1001, "John", "HR", "HR Manager");
        Employee emp2 = new Employee(1002, "Alice", "Finance", "Financial Analyst");
        Employee emp3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee emp4 = new Employee(1004, "Emma", "Marketing", "Marketing Specialist");
 
        // Store employees in the hashtable using id as key
        employeeTable.put(emp1.hashCode(), emp1);
        employeeTable.put(emp2.hashCode(), emp2);
        employeeTable.put(emp3.hashCode(), emp3);
        employeeTable.put(emp4.hashCode(), emp4);
 
        // Take input for search id
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee id to search: ");
        int searchId = scanner.nextInt();
 
        // Search for the employee
        Employee searchResult = employeeTable.get(searchId);
        if (searchResult != null) {
            System.out.println(searchResult);
        } else {
            System.out.println("Employee not found.");
        }
        scanner.close();
    }
}
