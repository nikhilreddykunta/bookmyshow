package com.nikhil.learning.bookmyshow.models;

import java.util.List;

public class City extends BaseModel{
    private String name;
    private List<Theatre> theatres = List.of();
}
