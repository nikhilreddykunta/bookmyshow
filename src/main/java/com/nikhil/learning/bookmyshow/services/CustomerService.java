package com.nikhil.learning.bookmyshow.services;

import com.nikhil.learning.bookmyshow.dtos.CreateCustomerDTO;
import com.nikhil.learning.bookmyshow.exceptions.CustomerNotFoundException;
import com.nikhil.learning.bookmyshow.exceptions.EmailAlreadyExistsException;
import com.nikhil.learning.bookmyshow.models.Customer;
import com.nikhil.learning.bookmyshow.models.User;
import com.nikhil.learning.bookmyshow.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {

    private CustomerRepository customerRepository;
    private UserService userService;

    public Customer getCustomer(Long id){
        return customerRepository
                .findById(id)
                .orElseThrow(() -> new CustomerNotFoundException(id));
    }

    public Customer createCustomer(CreateCustomerDTO request){

        //validate input data
        String email = request.getEmail();
        Optional<Customer> existingCustomer = customerRepository.findCustomerByEmail(email);

        if(existingCustomer.isPresent()){
            throw new EmailAlreadyExistsException(email);
        }

        //create user
        User user = userService.createUser(request.getUsername(), request.getPassword());

        //create customer
        Customer customer = Customer.builder()
                .fullName(request.getFullName())
                .city(request.getCity())
                .phoneNumber(request.getPhoneNumber())
                .email(request.getEmail())
                .user(user)
                .build();

        return customerRepository.save(customer);
    }
}
