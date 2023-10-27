package com.nikhil.learning.bookmyshow.models;

import com.nikhil.learning.bookmyshow.enums.Language;
import com.nikhil.learning.bookmyshow.enums.MovieFeature;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie extends BaseModel{

    private String name;
    private int rating;
    private String category;

    @Enumerated
    @ElementCollection
    private List<Language> languages = new ArrayList<>();

    @ElementCollection
    @Enumerated
    private List<MovieFeature> features = new ArrayList<>();

    @OneToMany
    private List<Show> shows = new ArrayList<>();
}
