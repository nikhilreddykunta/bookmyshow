package com.nikhil.learning.bookmyshow.services;

import com.nikhil.learning.bookmyshow.dtos.AddMovieDTO;
import com.nikhil.learning.bookmyshow.exceptions.CustomerNotFoundException;
import com.nikhil.learning.bookmyshow.exceptions.MovieNotFoundException;
import com.nikhil.learning.bookmyshow.models.Movie;
import com.nikhil.learning.bookmyshow.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;
    public Movie getMovie(Long id){
        return movieRepository
                .findById(id)
                .orElseThrow(() -> new MovieNotFoundException(id));
    }

    public Movie createMovie(AddMovieDTO request) {
        Movie movie = Movie.builder()
                .name(request.getName())
                .rating(request.getRating())
                .category(request.getCategory())
                .languages(request.getLanguages())
                .features(request.getFeatures())
                .build();

        return movieRepository.save(movie);
    }

    public List<Movie> listMovies() {
        return movieRepository
                .findAll();

    }
}
