package com.example.Cab_Booking_clone.Service;

import com.example.Cab_Booking_clone.Model.Admin;
import com.example.Cab_Booking_clone.Model.Customer;
import com.example.Cab_Booking_clone.Model.Driver;

import java.util.List;

public interface AdminService {

    public void adminRegister(Admin admin);

    public Admin updatePassword(Integer adminId, String password);

    public void deleteAdmin(int adminId);

    public List<Driver> getListOfDrivers();

    public List<Customer> getListOfCustomers();
}
