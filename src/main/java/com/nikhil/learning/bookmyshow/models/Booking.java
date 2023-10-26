package com.nikhil.learning.bookmyshow.models;

import com.nikhil.learning.bookmyshow.enums.BookingStatus;

import java.util.Date;
import java.util.List;

public class Booking extends BaseModel{
    private Customer customer;
    private Show show;
    private List<ShowSeat> showSeats = List.of();
    private Double amout;
    private Date bookedAt;
    private BookingStatus bookingStatus;
    private List<Payment> payments = List.of();
}
