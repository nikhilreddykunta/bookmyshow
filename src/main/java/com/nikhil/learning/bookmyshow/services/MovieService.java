package com.nikhil.learning.bookmyshow.services;

import com.nikhil.learning.bookmyshow.exceptions.CustomerNotFoundException;
import com.nikhil.learning.bookmyshow.exceptions.MovieNotFoundException;
import com.nikhil.learning.bookmyshow.models.Movie;
import com.nikhil.learning.bookmyshow.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;
    public Movie getMovie(Long id){
        return movieRepository
                .findById(id)
                .orElseThrow(() -> new MovieNotFoundException(id));
    }
}
