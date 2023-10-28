package com.nikhil.learning.bookmyshow.exceptions;

public class InvalidCustomerException extends RuntimeException {

    public InvalidCustomerException(){
        super("Customer Email is mandatory");
    }
}
