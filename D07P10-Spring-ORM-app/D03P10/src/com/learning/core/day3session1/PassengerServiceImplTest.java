package com.learning.core.day3session1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
 
@SpringBootTest
class PassengerServiceImplTest {
    @Autowired
    private PassengerService passengerService;
 
    @Test
    void testCRUDOperations() {
        // Add passenger
        Passenger newPassenger = new Passenger();
        newPassenger.setName("Test");
        newPassenger.setDob("2000-01-01");
        newPassenger.setPhone("1234567890");
        newPassenger.setEmail("test@example.com");
        passengerService.savePassenger(newPassenger);
 
        // Retrieve passenger
        Passenger retrievedPassenger = passengerService.getPassengerById(newPassenger.getId());
        assertNotNull(retrievedPassenger);
        assertEquals("Test", retrievedPassenger.getName());
 
        // Update passenger
        retrievedPassenger.setEmail("updated@example.com");
        passengerService.updatePassenger(retrievedPassenger);
        Passenger updatedPassenger = passengerService.getPassengerById(newPassenger.getId());
        assertEquals("updated@example.com", updatedPassenger.getEmail());
 
        // Delete passenger
        passengerService.deletePassenger(newPassenger.getId());
        Passenger deletedPassenger = passengerService.getPassengerById(newPassenger.getId());
        assertNull(deletedPassenger);
    }
}
