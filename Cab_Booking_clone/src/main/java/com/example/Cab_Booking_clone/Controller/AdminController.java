package com.example.Cab_Booking_clone.Controller;

import com.example.Cab_Booking_clone.Model.Admin;
import com.example.Cab_Booking_clone.Model.Customer;
import com.example.Cab_Booking_clone.Model.Driver;
import com.example.Cab_Booking_clone.Service.Impl.AdminServiceImpl;
import com.example.Cab_Booking_clone.Service.Impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/admin")

public class AdminController {
    @Autowired
    AdminServiceImpl adminService ;

    @Autowired
    CustomerServiceImpl customerService ;

    @PostMapping("/register")
    public ResponseEntity<Void> registerAdmin(@RequestBody Admin admin){
        adminService.adminRegister(admin);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Admin> updateAdminPassword(@RequestParam Integer adminId, @RequestParam String password){
        Admin updatedAdmin = adminService.updatePassword(adminId,password) ;
        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public void deleteAdmin(@RequestParam Integer adminId){
        adminService.deleteAdmin(adminId);
    }

    @GetMapping("/listOfCustomers")
    public List<Customer> listOfCustomers() {
        List<Customer> listOfCustomers =  adminService.getListOfCustomers() ;
        return listOfCustomers;
    }

    @GetMapping("/listOfDrivers")
    public List<Driver> listOfDrivers() {
        List<Driver> listOfDrivers = adminService.getListOfDrivers() ;
        return listOfDrivers;
    }
}
