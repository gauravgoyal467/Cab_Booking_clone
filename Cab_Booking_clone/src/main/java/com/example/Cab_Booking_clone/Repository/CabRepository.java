package com.example.Cab_Booking_clone.Repository;

import com.example.Cab_Booking_clone.Model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabRepository extends JpaRepository<Cab,Integer> {
}
