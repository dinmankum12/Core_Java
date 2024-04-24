package com.learning.core.day3session1;

public class PassengerService {
    private PassengerDAO passengerDAO;
 
    public void setPassengerDAO(PassengerDAO passengerDAO) {
        this.passengerDAO = passengerDAO;
    }
 
    public Passenger getPassengerById(int id) {
        return passengerDAO.getPassengerById(id);
    }
 
    public void addPassenger(Passenger passenger) {
        passengerDAO.addPassenger(passenger);
    }
 
    public void updatePassenger(Passenger passenger) {
        passengerDAO.updatePassenger(passenger);
    }
 
    public void deletePassenger(int id) {
        passengerDAO.deletePassenger(id);
    }
}
