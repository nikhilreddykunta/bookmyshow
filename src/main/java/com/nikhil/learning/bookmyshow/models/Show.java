package com.nikhil.learning.bookmyshow.models;

import java.util.Date;
import java.util.List;

public class Show extends BaseModel{
    private Date startTime;
    private Movie movie;
    private int duration;
    private String language;
    private List<ShowSeat> showSeats = List.of();

}
