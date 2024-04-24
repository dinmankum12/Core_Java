package com.learning.core.day3session1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
 
@SpringBootTest
public class PassengerServiceTest {
    @Autowired
    private PassengerService passengerService;
 
    @Test
    public void testCRUDOperations() {
        // Add passenger
        Passenger newPassenger = new Passenger(1239, "Test", "2000-01-01", "1234567890", "test@example.com");
        passengerService.addPassenger(newPassenger);
 
        // Retrieve passenger
        Passenger retrievedPassenger = passengerService.getPassengerById(1239);
        assertNotNull(retrievedPassenger);
        assertEquals("Test", retrievedPassenger.getName());
 
        // Update passenger
        retrievedPassenger.setEmail("updated@example.com");
        passengerService.updatePassenger(retrievedPassenger);
        Passenger updatedPassenger = passengerService.getPassengerById(1239);
        assertEquals("updated@example.com", updatedPassenger.getEmail());
 
        // Delete passenger
        passengerService.deletePassenger(1239);
        Passenger deletedPassenger = passengerService.getPassengerById(1239);
        assertNull(deletedPassenger);
    }
}
