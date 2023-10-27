package com.nikhil.learning.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Show extends BaseModel{

    private Date startTime;

    @ManyToOne
    private Movie movie;

    private int duration;
    private String language;

    @OneToMany
    private List<ShowSeat> showSeats = new ArrayList<>();

    @ManyToOne
    private Screen screen;

}
