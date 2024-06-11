package com.coderbyte.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Kashif Rehman
 * Created on 11th Of June,2024.
 * The PostService class will handle the business logic and interaction with external API.
 */

@Service
public class PostService {

	@Autowired
    private RestTemplate restTemplate;

    private final String URL = "https://gorest.co.in/public/v2/posts";

    public String getAllPosts() {
        return restTemplate.getForObject(URL, String.class);
    }

    public String getPostsByUser(Long userId) {
        return restTemplate.getForObject(URL + "?user_id=" + userId, String.class);
    }
	    
}
