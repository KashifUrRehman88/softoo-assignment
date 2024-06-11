package com.coderbyte.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Kashif Rehman
 * Created on 11th Of June,2024.
 * The ComentService class will handle the business logic and interaction with external API.
 */

@Service
public class CommentService {

	@Autowired
    private RestTemplate restTemplate;

    private final String URL = "https://gorest.co.in/public/v2/comments";

    public String getAllComments() {
        return restTemplate.getForObject(URL, String.class);
    }

    public String getCommentsByPost(Long postId) {
        return restTemplate.getForObject(URL + "?post_id=" + postId, String.class);
    }
	    
}
