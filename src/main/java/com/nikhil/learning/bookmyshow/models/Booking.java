package com.nikhil.learning.bookmyshow.models;

import com.nikhil.learning.bookmyshow.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking extends BaseModel{

    @ManyToOne
    private User user;

    @ManyToOne
    private Show show;

    @ManyToMany
    private List<ShowSeat> showSeats = new ArrayList<>();

    private Double amount;
    private Date bookedAt;

    @Enumerated
    private BookingStatus bookingStatus;

    @OneToMany
    private List<Payment> payments = new ArrayList<>();
}
