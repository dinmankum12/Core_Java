package com.learning.core.day4session1;

import java.util.Date;

public class Passenger_Details {
    private int Passenger_id;
    private String Passenger_name;
    private Date Passenger_dob;
    private String Passenger_phone;
    private String Passenger_email;
 
    // Constructors
    public Passenger_Details() {
    }
 
    public Passenger_Details(int Passenger_id, String Passenger_name, Date Passenger_dob, String Passenger_phone, String Passenger_email) {
        this.Passenger_id = Passenger_id;
        this.Passenger_name = Passenger_name;
        this.Passenger_dob = Passenger_dob;
        this.Passenger_phone = Passenger_phone;
        this.Passenger_email = Passenger_email;
    }
 
    // Getters and Setters
    public int getPassenger_id() {
        return Passenger_id;
    }
 
    public void setPassenger_id(int Passenger_id) {
        this.Passenger_id = Passenger_id;
    }
 
    public String getPassenger_name() {
        return Passenger_name;
    }
 
    public void setPassenger_name(String Passenger_name) {
        this.Passenger_name = Passenger_name;
    }
 
    public Date getPassenger_dob() {
        return Passenger_dob;
    }
 
    public void setPassenger_dob(Date Passenger_dob) {
        this.Passenger_dob = Passenger_dob;
    }
 
    public String getPassenger_phone() {
        return Passenger_phone;
    }
 
    public void setPassenger_phone(String Passenger_phone) {
        this.Passenger_phone = Passenger_phone;
    }
 
    public String getPassenger_email() {
        return Passenger_email;
    }
 
    public void setPassenger_email(String Passenger_email) {
        this.Passenger_email = Passenger_email;
    }
}