package com.nikhil.learning.bookmyshow.controllers;

import com.nikhil.learning.bookmyshow.dtos.AddMovieDTO;
import com.nikhil.learning.bookmyshow.exceptions.InvalidMovieException;
import com.nikhil.learning.bookmyshow.models.Movie;
import com.nikhil.learning.bookmyshow.services.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable Long id){
        return movieService.getMovie(id);
    }

    @GetMapping("/movies")
    public List<Movie> listMovies(){
        return movieService.listMovies();
    }

    @PostMapping
    public Movie addMovie(@RequestBody AddMovieDTO request){
        validate(request);
        return movieService.createMovie(request);
    }

    private void validate(AddMovieDTO request) {
        if(request.getName() == null){
            throw new InvalidMovieException();
        }
    }
}
