package com.example.Cab_Booking_clone.Repository;

import com.example.Cab_Booking_clone.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
