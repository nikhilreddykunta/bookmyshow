package com.nikhil.learning.bookmyshow.models;

import java.util.List;

public class Theatre extends BaseModel{
    private String name;
    private String address;
    private List<Screen> screens = List.of();
    private List<Show> shows = List.of();
}
