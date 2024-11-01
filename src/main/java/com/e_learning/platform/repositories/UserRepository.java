// src/main/java/com/e_learning/platform/repositories/UserRepository.java
package com.e_learning.platform.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_learning.platform.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndPassword(String email, String password); // Custom query method
}
