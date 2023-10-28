package com.nikhil.learning.bookmyshow.models;

import com.nikhil.learning.bookmyshow.enums.MovieFeature;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Screen extends BaseModel{

    private String name;

    @OneToMany(mappedBy = "screen")
    private List<Show> shows = new ArrayList<>();

    @OneToMany(mappedBy = "screen")
    private List<Seat> seats = new ArrayList<>();

    @ElementCollection
    @Enumerated
    private List<MovieFeature> features = new ArrayList<>();

}
