// src/main/java/com/e_learning/platform/services/UserService.java
package com.e_learning.platform.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_learning.platform.models.Instructor;
import com.e_learning.platform.models.User;
import com.e_learning.platform.repositories.InstructorRepository;
import com.e_learning.platform.repositories.UserRepository;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    public List<Instructor> getAllInstructorList(){
		List<Instructor> instructors=instructorRepository.findAll();
		System.out.println("Getting data from database"+instructors);
		return instructorRepository.findAll();
	}
    
    public Instructor registerUser(Instructor instructor) {
        return instructorRepository.save(instructor);
    }
    public void deleteEmployee(long Id) {
    	instructorRepository.deleteById(Id);
	}
    
    public Optional<Instructor> loginUser(String email, String password) {
        return instructorRepository.findByEmailAndPassword(email, password); // Validate credentials
    }
}
