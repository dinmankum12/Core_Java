package com.learning.core.day3session1;

import javax.persistence.*;

@Entity
@Table(name = "Passenger_Details")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Passenger_id")
    private int id;
 
    @Column(name = "Passenger_name")
    private String name;
 
    @Column(name = "Passenger_dob")
    private String dob;
 
    @Column(name = "Passenger_phone")
    private String phone;
 
    @Column(name = "Passenger_email")
    private String email;
 
    // Constructors
    public Passenger() {}
 
    public Passenger(String name, String dob, String phone, String email) {
this.name = name;
        this.dob = dob;
        this.phone = phone;
this.email = email;
    }
 
    // Getters and setters
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
this.name = name;
    }
 
    public String getDob() {
        return dob;
    }
 
    public void setDob(String dob) {
        this.dob = dob;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
this.email = email;
    }
 
    // toString method
    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
