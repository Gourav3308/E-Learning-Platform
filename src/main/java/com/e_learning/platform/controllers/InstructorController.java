// src/main/java/com/e_learning/platform/controllers/UserController.java
package com.e_learning.platform.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_learning.platform.models.Instructor;
import com.e_learning.platform.models.User;
import com.e_learning.platform.services.InstructorService;
import com.e_learning.platform.services.UserService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    
    @GetMapping("/get")
	public List<Instructor> getAllEmployees() {
//	return employeeRepo.findAll();
		return instructorService.getAllInstructorList();
	}
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Validated @RequestBody Instructor instructor) {
    	instructorService.registerUser(instructor);
//        return ResponseEntity.ok("User registered successfully");
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully"); // 201 Created
    }
    @DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable long id) {
		this.instructorService.deleteEmployee(id);
	}

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody Instructor loginRequest) {
        Optional<Instructor> instructor = instructorService.loginUser(loginRequest.getEmail(), loginRequest.getPassword());

        if (instructor.isPresent()) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
