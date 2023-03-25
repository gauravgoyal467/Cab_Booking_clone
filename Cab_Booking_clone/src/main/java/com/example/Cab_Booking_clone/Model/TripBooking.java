package com.example.Cab_Booking_clone.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "tripBooking")
public class TripBooking {
    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tripBookingId;
    private String fromLocation;
    private String toLocation;
    private int distanceInKm;
    @Enumerated(EnumType.STRING)
    private TripStatus status;
    private int bill;

    //constructor
    public TripBooking() {
    }

    public TripBooking(int tripBookingId, String fromLocation, String toLocation, int distanceInKm, TripStatus status, int bill, Customer customer, Driver driver) {
        this.tripBookingId = tripBookingId;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
        this.status = status;
        this.bill = bill;
        this.customer = customer;
        this.drivers = driver;
    }

    //getters and setters
    public int getTripBookingId() { return tripBookingId; }
    public void setTripBookingId(int tripBookingId) { this.tripBookingId = tripBookingId; }

    public String getFromLocation() { return fromLocation; }
    public void setFromLocation(String fromLocation) { this.fromLocation = fromLocation; }

    public String getToLocation() { return toLocation; }
    public void setToLocation(String toLocation) { this.toLocation = toLocation; }

    public int getDistanceInKm() { return distanceInKm; }
    public void setDistanceInKm(int distanceInKm) { this.distanceInKm = distanceInKm; }

    public TripStatus getStatus() { return status; }
    public void setStatus(TripStatus status) { this.status = status; }

    public int getBill() { return bill; }
    public void setBill(int bill) { this.bill = bill; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Driver getDriver() { return drivers; }
    public void setDriver(Driver driver) { this.drivers = driver; }

    //mapping
    @ManyToOne
    @JoinColumn
    private Customer customer;

    @ManyToOne
    @JoinColumn
    private Driver drivers;
}