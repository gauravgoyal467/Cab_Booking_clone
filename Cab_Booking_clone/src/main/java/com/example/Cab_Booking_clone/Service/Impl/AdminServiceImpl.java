package com.example.Cab_Booking_clone.Service.Impl;

import com.example.Cab_Booking_clone.Model.Admin;
import com.example.Cab_Booking_clone.Model.Customer;
import com.example.Cab_Booking_clone.Model.Driver;
import com.example.Cab_Booking_clone.Repository.AdminRepository;
import com.example.Cab_Booking_clone.Repository.CustomerRepository;
import com.example.Cab_Booking_clone.Repository.DriverRepository;
import com.example.Cab_Booking_clone.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository1;

    @Autowired
    DriverRepository driverRepository1;

    @Autowired
    CustomerRepository customerRepository1;

    @Override
    public void adminRegister(Admin admin) {
        //Save the admin in the database
        adminRepository1.save(admin);
    }

    @Override
    public Admin updatePassword(Integer adminId, String password) {
        //Update the password of admin with given id
        Admin admin=adminRepository1.findById(adminId).get();
        admin.setPassword(password);
        adminRepository1.save(admin);
        return admin;
    }

    @Override
    public void deleteAdmin(int adminId){
        // Delete admin without using deleteById function
        Admin admin=adminRepository1.findById(adminId).get();
        adminRepository1.delete(admin);
    }

    @Override
    public List<Driver> getListOfDrivers() {
        //Find the list of all drivers
        List<Driver> driverList=driverRepository1.findAll();
        return driverList;
    }

    @Override
    public List<Customer> getListOfCustomers() {
        //Find the list of all customers
        List<Customer> customerList=customerRepository1.findAll();
        return customerList;
    }
}

