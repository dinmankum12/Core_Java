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
        return id + " " + name + " " + department + " " + designation;
    }
 
    @Override
    public int hashCode() {
        return id;
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
 
public class D03P0811 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
 
        // Predefined information of 4 employees
        employeeTable.put(1001, new Employee(1001, "Daniel", "L&D", "Analyst"));
        employeeTable.put(1002, new Employee(1002, "Thomas", "Testing", "Tester"));
        employeeTable.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new Employee(1004, "Grace", "HR", "Tech Support"));
 
        // Function to add an employee if not exists
        addEmployeeIfNotExists(employeeTable, 1005, "Charles", "Testing", "QA Lead");
 
        // Printing employee details
        employeeTable.forEach((key, value) -> System.out.println(value));
    }
 
    private static void addEmployeeIfNotExists(Hashtable<Integer, Employee> table, int id, String name, String department, String designation) {
        if (!table.containsKey(id)) {
            table.put(id, new Employee(id, name, department, designation));
        }
    }
}
