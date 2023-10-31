package com.nikhil.learning.bookmyshow.exceptions;

public class InvalidMovieException extends RuntimeException {

    public InvalidMovieException() {
        super("Movie name is mandatory");
    }
}
