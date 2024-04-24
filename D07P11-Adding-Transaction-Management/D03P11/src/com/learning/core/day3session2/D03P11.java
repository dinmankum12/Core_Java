package com.learning.core.day3session2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class D03P11 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PassengerService passengerService = context.getBean(PassengerService.class);
 
        // Test CRUD operations
        Passenger newPassenger = new Passenger();
        newPassenger.setName("Test");
        newPassenger.setDob("2000-01-01");
        newPassenger.setPhone("1234567890");
        newPassenger.setEmail("test@example.com");
        passengerService.addPassenger(newPassenger);
 
        Passenger retrievedPassenger = passengerService.getPassengerById(newPassenger.getId());
        System.out.println("Retrieved Passenger: " + retrievedPassenger);
 
        retrievedPassenger.setEmail("updated@example.com");
        passengerService.updatePassenger(retrievedPassenger);
        Passenger updatedPassenger = passengerService.getPassengerById(newPassenger.getId());
        System.out.println("Updated Passenger: " + updatedPassenger);
 
        passengerService.deletePassenger(newPassenger.getId());
        System.out.println("Passenger deleted.");
 
        // Retrieve deleted passenger to verify deletion
        Passenger deletedPassenger = passengerService.getPassengerById(newPassenger.getId());
        System.out.println("Deleted Passenger: " + deletedPassenger);
    }
}
