# Cab_Booking_clone
Cab_Booking is a ride-hailing service that allows customers to book rides through a mobile application. In order to facilitate this service, which needs a system to manage the different entities involved in the service such as the customers, drivers, cabs, and trip bookings. 

## Tech Stack Used

**Programming Langauge** Java

**Framework** Spring Boot, JPA

**Database** My-SQL server

## Features
1. An Admin entity that can register new admins, update the password of existing admins, and delete existing admins.
2. A Customer entity that can register new customers, delete existing customers, and book trips. When a customer books a trip, the system should assign the nearest available driver and cab to the customer. The customer should also be able to cancel or complete the trip.
3. A Driver entity that can register new drivers, delete existing drivers and update the status of their cab (available or unavailable).
4. A Cab entity that has information about the per-km rate and the availability of the cab.
5. A TripBooking entity that stores information about the trip such as the from and to locations, the distance, the status of the trip, and the bill.

Many more API's can be made according to the need of the service and more  complex structure schema can be made according to need.
