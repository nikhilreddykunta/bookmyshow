package com.nikhil.learning.bookmyshow.models;

import java.util.List;

public class Movie extends BaseModel{
    private String name;
    private int rating;
    private String category;
    private List<String> languages = List.of();
    private List<Show> shows = List.of();
}
