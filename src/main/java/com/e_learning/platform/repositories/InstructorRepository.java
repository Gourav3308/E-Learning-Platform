// src/main/java/com/e_learning/platform/repositories/UserRepository.java
package com.e_learning.platform.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_learning.platform.models.Instructor;


public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    Optional<Instructor> findByEmailAndPassword(String email, String password); // Custom query method
}
