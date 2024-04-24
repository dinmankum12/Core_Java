package com.learning.core.day3session1;

public interface PassengerDAO {
    Passenger getPassengerById(int id);
    void addPassenger(Passenger passenger);
    void updatePassenger(Passenger passenger);
    void deletePassenger(int id);
}
