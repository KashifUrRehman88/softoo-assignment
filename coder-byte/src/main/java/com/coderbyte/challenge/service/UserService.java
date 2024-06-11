package com.coderbyte.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Kashif Rehman
 * Created on 11th Of June,2024.
 * The UserService class will handle the business logic and interaction with external API.
 */

@Service
public class UserService {

	@Autowired
    private RestTemplate restTemplate;

    private final String URL = "https://gorest.co.in/public/v2/users";

    public String getAllUsers() {
        return restTemplate.getForObject(URL, String.class);
    }
	
}
