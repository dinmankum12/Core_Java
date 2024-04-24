package com.learning.core.day3session1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
 
@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    private PassengerDAO passengerDAO;
 
    @Override
    @Transactional
    public void savePassenger(Passenger passenger) {
        passengerDAO.savePassenger(passenger);
    }
 
    @Override
    @Transactional
    public void updatePassenger(Passenger passenger) {
        passengerDAO.updatePassenger(passenger);
    }
 
    @Override
    @Transactional
    public void deletePassenger(int id) {
        passengerDAO.deletePassenger(id);
    }
 
    @Override
    public Passenger getPassengerById(int id) {
        return passengerDAO.getPassengerById(id);
    }
 
    @Override
    public List<Passenger> getAllPassengers() {
        return passengerDAO.getAllPassengers();
    }
}
