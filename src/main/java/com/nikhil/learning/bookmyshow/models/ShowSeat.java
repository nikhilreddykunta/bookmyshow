package com.nikhil.learning.bookmyshow.models;

import com.nikhil.learning.bookmyshow.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class ShowSeat extends BaseModel{

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated
    private SeatStatus seatStatus;
}
