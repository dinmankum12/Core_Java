package com.learning.core.day3session1;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.List;
 
public class PassengerDAOImpl implements PassengerDAO {
    private JdbcTemplate jdbcTemplate;
 
    public PassengerDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
 
    @Override
    public Passenger getPassengerById(int id) {
        String sql = "SELECT * FROM Passenger_Details WHERE Passenger_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new PassengerRowMapper());
    }
 
    @Override
    public void addPassenger(Passenger passenger) {
        String sql = "INSERT INTO Passenger_Details (Passenger_id, Passenger_name, Passenger_dob, Passenger_phone, Passenger_email) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, passenger.getId(), passenger.getName(), passenger.getDob(), passenger.getPhone(), passenger.getEmail());
    }
