package com.learning.core.day3session2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
@Repository
public class PassengerDAOImpl implements PassengerDAO {
    @Autowired
    private SessionFactory sessionFactory;
 
    @Override
    public Passenger getPassengerById(int id) {
        return sessionFactory.getCurrentSession().get(Passenger.class, id);
    }
}