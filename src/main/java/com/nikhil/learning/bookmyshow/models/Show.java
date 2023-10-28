package com.nikhil.learning.bookmyshow.models;

import com.nikhil.learning.bookmyshow.enums.Language;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@Table(name = "shows")
public class Show extends BaseModel{

    private Date startTime;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    private int duration;

    @Enumerated
    private Language language;

    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeats = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;

}
