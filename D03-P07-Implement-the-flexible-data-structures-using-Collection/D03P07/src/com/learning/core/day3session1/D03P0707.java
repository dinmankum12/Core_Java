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
 
    public String getName() {
        return name;
    }
 
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
return id == person.id;
    }
 
    @Override
    public int compareTo(Person o) {
return Integer.compare(this.id, o.id);
    }
}
 
public class D03P0707 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();
 
        // Predefined information of 6 persons
        personSet.add(new Person(1, "John", 30, 50000));
        personSet.add(new Person(2, "Jerry", 25, 60000));
        personSet.add(new Person(3, "Tom", 35, 70000));
        personSet.add(new Person(4, "Smith", 40, 80000));
        personSet.add(new Person(5, "Jones", 45, 90000));
        personSet.add(new Person(6, "Popeye", 50, 100000));
 
        // Printing all the names of persons in uppercase
        for (Person person : personSet) {
            System.out.println(person.getName().toUpperCase());
        }
    }
}
