package com.nikhil.learning.bookmyshow.services;

import com.nikhil.learning.bookmyshow.models.User;
import com.nikhil.learning.bookmyshow.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User createUser(String userName, String password) {
        User user = new User(userName, password);
        return userRepository.save(user);
    }
}
