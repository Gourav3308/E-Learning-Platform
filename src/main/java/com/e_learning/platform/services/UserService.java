// src/main/java/com/e_learning/platform/services/UserService.java
package com.e_learning.platform.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_learning.platform.models.User;
import com.e_learning.platform.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> loginUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password); // Validate credentials
    }
}
