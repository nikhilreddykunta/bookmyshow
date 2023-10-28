package com.nikhil.learning.bookmyshow.controllers;

import com.nikhil.learning.bookmyshow.dtos.CreateCustomerDTO;
import com.nikhil.learning.bookmyshow.exceptions.InvalidCustomerException;
import com.nikhil.learning.bookmyshow.models.Customer;
import com.nikhil.learning.bookmyshow.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody CreateCustomerDTO request) {
        validate(request);
        return customerService.createCustomer(request);
    }

    private void validate(CreateCustomerDTO request) {
        if(request.getEmail() == null)
            throw new InvalidCustomerException();
    }
}
