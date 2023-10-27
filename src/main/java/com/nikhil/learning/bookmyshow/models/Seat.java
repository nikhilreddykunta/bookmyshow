package com.nikhil.learning.bookmyshow.models;

import com.nikhil.learning.bookmyshow.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;

@Getter
@Entity
public class Seat extends BaseModel{

    private String number;

    @Enumerated
    private SeatType seatType;
}
