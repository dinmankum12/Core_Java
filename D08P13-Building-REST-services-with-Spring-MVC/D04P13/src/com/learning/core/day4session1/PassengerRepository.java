package com.learning.core.day4session1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
