package com.learning.core.day3session2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    private PassengerDAO passengerDAO;
 
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addPassenger(Passenger passenger) {
        passengerDAO.save(passenger);
    }
}
