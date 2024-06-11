package com.coderbyte.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.coderbyte.challenge.service.UserService;

/**
 * @author Kashif Rehman
 * Created on 11th Of June,2024.
 * UserController handles HTTP requests related to users. It delegates business logic to the UserService.
 */

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
    private UserService userService;

	 /**
     * Endpoint to get all users.
     * 
     * @return ResponseEntity containing the list of users in JSON format.
     */
    @GetMapping
    public ResponseEntity<String> getAllUsers() {
    	 String response = userService.getAllUsers();
         return ResponseEntity.ok(response);
    }

}
