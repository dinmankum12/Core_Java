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
 
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
return id == person.id && age == person.age && Double.compare(person.salary, salary) == 0 && Objects.equals(name, person.name);
    }
 
    @Override
    public int compareTo(Person o) {
return Integer.compare(this.id, o.id);
    }
}
 
public class D03P0708 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();
 
        // Predefined information of 6 persons
        personSet.add(new Person(1, "Alice", 25, 4000));
        personSet.add(new Person(2, "Bob", 30, 5000));
        personSet.add(new Person(3, "Charlie", 35, 6000));
        personSet.add(new Person(4, "David", 40, 7000));
        personSet.add(new Person(5, "Eve", 45, 8000));
        personSet.add(new Person(6, "Frank", 50, 7000));
 
        // Printing the sum of all salaries
        double sum = personSet.stream().mapToDouble(Person::getSalary).sum();
        System.out.println(sum);
    }
}
