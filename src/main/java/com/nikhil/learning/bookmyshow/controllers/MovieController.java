package com.nikhil.learning.bookmyshow.controllers;

import com.nikhil.learning.bookmyshow.dtos.AddMovieDTO;
import com.nikhil.learning.bookmyshow.models.Movie;
import com.nikhil.learning.bookmyshow.services.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable Long id){
        return movieService.getMovie(id);
    }

    @PostMapping
    public Movie addMovie(@RequestBody AddMovieDTO request){
        return null;
    }
}
