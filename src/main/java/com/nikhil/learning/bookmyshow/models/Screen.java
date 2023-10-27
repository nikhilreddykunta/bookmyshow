package com.nikhil.learning.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Screen extends BaseModel{

    private String name;

    @OneToMany
    private List<Show> shows = new ArrayList<>();

    @OneToMany
    private List<Seat> seats = new ArrayList<>();

}
