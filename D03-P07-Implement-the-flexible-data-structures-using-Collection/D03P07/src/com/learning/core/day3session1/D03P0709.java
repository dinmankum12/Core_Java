package com.learning.core.day3session1;

import java.util.*;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;
 
    public Person(int id, String name, int age, double salary) {
this.id = id;
this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    // Getters
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public double getSalary() {
        return salary;
    }
 
    // toString method
 
    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }
 
    // equals method
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
return id == person.id &&
                Double.compare(person.salary, salary) == 0 &&
name.equals(person.name);
    }
 
    // hashCode method
 
    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
 
    // compareTo method for natural sorting using id
 
    @Override
    public int compareTo(Person other) {
return Integer.compare(this.id, other.id);
    }
}
 
public class D03P0709 {
    public static void main(String[] args) {
        TreeSet<Person> personTreeSet = new TreeSet<>();
 
        // Adding predefined information of 6 person details
        personTreeSet.add(new Person(1, "John", 30, 5000.0));
        personTreeSet.add(new Person(2, "Alice", 25, 6000.0));
        personTreeSet.add(new Person(3, "Bob", 35, 7000.0));
        personTreeSet.add(new Person(4, "Jones", 22, 6999.0));
        personTreeSet.add(new Person(5, "Jack", 28, 5500.0));
        personTreeSet.add(new Person(6, "Jill", 40, 8000.0));
 
        // Finding and printing the first person whose name starts with J
        for (Person person : personTreeSet) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}
