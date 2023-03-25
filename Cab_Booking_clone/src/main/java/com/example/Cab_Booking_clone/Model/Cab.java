package com.example.Cab_Booking_clone.Model;


import jakarta.persistence.*;
@Entity
@Table(name = "cab")
public class Cab {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private int perKmRate;
    private boolean available;

    //constructor
    public Cab() {
    }

    public Cab(int id, int perKmRate, boolean available, Driver driver) {
        this.Id = id;
        this.perKmRate = perKmRate;
        this.available = available;
        this.driver = driver;
    }

    //getters and setters
    public int getId() { return Id; }
    public void setId(int id) { Id = id; }

    public int getPerKmRate() { return perKmRate; }
    public void setPerKmRate(int perKmRate) { this.perKmRate = perKmRate; }

    public boolean getAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public Driver getDriver() { return driver; }
    public void setDriver(Driver driver) { this.driver = driver; }

    //mapping
    @OneToOne
    @JoinColumn
    private Driver driver;

}
