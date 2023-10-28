package com.nikhil.learning.bookmyshow.exceptions;

public class EmailAlreadyExistsException extends RuntimeException {

    public EmailAlreadyExistsException(String email) {
        super("Customer with email: "+email+ " already exists");
    }
}
