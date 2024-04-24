package com.learning.core.day3session1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;
 
@Repository
public class PassengerDAOImpl implements PassengerDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;
 
    @Override
    public void savePassenger(Passenger passenger) {
        hibernateTemplate.save(passenger);
    }
 
    @Override
    public void updatePassenger(Passenger passenger) {
        hibernateTemplate.update(passenger);
    }
 
    @Override
    public void deletePassenger(int id) {
        Passenger passenger = hibernateTemplate.load(Passenger.class, id);
        hibernateTemplate.delete(passenger);
    }
 
    @Override
    public Passenger getPassengerById(int id) {
        return hibernateTemplate.get(Passenger.class, id);
    }
 
    @Override
    public List<Passenger> getAllPassengers() {
        return hibernateTemplate.loadAll(Passenger.class);
    }
}
