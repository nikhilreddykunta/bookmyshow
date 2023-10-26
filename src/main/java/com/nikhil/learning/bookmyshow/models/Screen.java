package com.nikhil.learning.bookmyshow.models;

import java.util.List;

public class Screen extends BaseModel{
    private String name;
    private List<Show> shows = List.of();
    private List<Seat> seats = List.of();

}
