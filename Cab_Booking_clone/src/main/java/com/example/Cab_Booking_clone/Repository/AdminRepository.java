package com.example.Cab_Booking_clone.Repository;

import com.example.Cab_Booking_clone.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
