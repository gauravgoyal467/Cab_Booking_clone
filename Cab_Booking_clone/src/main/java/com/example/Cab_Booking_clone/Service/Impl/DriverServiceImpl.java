package com.example.Cab_Booking_clone.Service.Impl;

import com.example.Cab_Booking_clone.Model.Cab;
import com.example.Cab_Booking_clone.Model.Driver;
import com.example.Cab_Booking_clone.Repository.CabRepository;
import com.example.Cab_Booking_clone.Repository.DriverRepository;
import com.example.Cab_Booking_clone.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepository driverRepository3;

    @Autowired
    CabRepository cabRepository3;

    @Override
    public void register(String mobile, String password){
        //Save a driver in the database having given details and a cab with ratePerKm as 10 and availability as True by default.
        Cab cab = new Cab();
        cab.setAvailable(true);
        cab.setPerKmRate(10);

        Driver driver = new Driver();
        driver.setMobile(mobile);
        driver.setPassword(password);

        driver.setCab(cab);
        cab.setDriver(driver);

        driverRepository3.save(driver);
    }

    @Override
    public void removeDriver(int driverId){
        //delete the driver without using deleteById
        Driver driver = driverRepository3.findById(driverId).get();
        driverRepository3.delete(driver);
    }

    @Override
    public void updateStatus(int driverId){
        //Set the status of respective car to unavailable
        Driver driver = driverRepository3.findById(driverId).get();
        driver.getCab().setAvailable(false);

        driverRepository3.save(driver);
    }
}