package com.example.Cab_Booking_clone.Repository;

import com.example.Cab_Booking_clone.Model.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripBookingRepository extends JpaRepository<TripBooking,Integer> {
}
