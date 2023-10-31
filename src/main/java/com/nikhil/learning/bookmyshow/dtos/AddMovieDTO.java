package com.nikhil.learning.bookmyshow.dtos;

import com.nikhil.learning.bookmyshow.enums.Language;
import com.nikhil.learning.bookmyshow.enums.MovieFeature;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class AddMovieDTO {
    private String name;
    private int rating;
    private String category;
    private List<Language> languages = new ArrayList<>();
    private List<MovieFeature> features = new ArrayList<>();
}
