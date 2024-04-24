package com.learning.core.day3session1;

import java.util.TreeSet;

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
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public double getSalary() {
        return salary;
    }
 
    @Override
    public int compareTo(Person other) {
return Integer.compare(this.id, other.id);
    }
 
    @Override
    public String toString() {
        return id + " " + name + " " + salary;
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
        Person person = (Person) obj;
return id == person.id;
    }
}
 
public class D03P0706 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        // Predefined information of 6 persons
        persons.add(new Person(1, "Jerry", 25, 999.0));
        persons.add(new Person(2, "Smith", 30, 2999.0));
        persons.add(new Person(3, "Popeye", 40, 5999.0));
        persons.add(new Person(4, "Jones", 45, 6999.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));
 
        // Print id, name, and salary of each person
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
