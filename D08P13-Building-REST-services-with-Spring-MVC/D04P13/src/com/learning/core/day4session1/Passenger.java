package com.learning.core.day4session1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Passenger {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passengerId;
    private String name;
    private int age;
    // Add other properties as needed
 
    // Constructors, getters, and setters
}