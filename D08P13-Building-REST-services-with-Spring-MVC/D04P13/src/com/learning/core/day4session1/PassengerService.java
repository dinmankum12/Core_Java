package com.learning.core.day4session1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/passengers")
public class PassengerController {
 
    @Autowired
    private PassengerService passengerService;
 
    @PostMapping
    public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger) {
        Passenger createdPassenger = passengerService.addPassenger(passenger);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPassenger);
    }
 
    @GetMapping
    public ResponseEntity<List<Passenger>> getAllPassengers() {
        List<Passenger> passengers = passengerService.getAllPassengers();
        return ResponseEntity.ok(passengers);
    }
 
    @GetMapping("/{passengerId}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable Long passengerId) {
        Passenger passenger = passengerService.getPassengerById(passengerId);
        if (passenger != null) {
            return ResponseEntity.ok(passenger);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
 
    @PutMapping("/{passengerId}")
    public ResponseEntity<Passenger> updatePassenger(@PathVariable Long passengerId, @RequestBody Passenger updatedPassenger) {
        Passenger passenger = passengerService.updatePassenger(passengerId, updatedPassenger);
        if (passenger != null) {
            return ResponseEntity.ok(passenger);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
 
    @DeleteMapping("/{passengerId}")
    public ResponseEntity<Void> deletePassenger(@PathVariable Long passengerId) {
        boolean deleted = passengerService.deletePassenger(passengerId);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}