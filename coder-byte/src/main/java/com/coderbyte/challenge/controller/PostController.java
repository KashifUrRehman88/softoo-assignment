package com.coderbyte.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.coderbyte.challenge.service.PostService;

/**
 * @author Kashif Rehman
 * Created on 11th Of June,2024.
 * PostController handles HTTP requests related to posts. It delegates business logic to the PostService.
 */

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
    private PostService postService;

	  /**
     * Endpoint to get all posts.
     * 
     * @return ResponseEntity containing the list of posts in JSON format.
     */
    @GetMapping
    public ResponseEntity<String> getAllPosts() {
    	 String response = postService.getAllPosts();
         return ResponseEntity.ok(response);
    }

    /**
     * Endpoint to get posts by a specific user.
     * 
     * @param userId The ID of the user whose posts are to be retrieved.
     * @return ResponseEntity containing the list of posts by the specified user in JSON format.
     */
    @GetMapping("/user/{userId}")
    public ResponseEntity<String> getPostsByUser(@PathVariable Long userId) {
    	String response = postService.getPostsByUser(userId);
        return ResponseEntity.ok(response);
    }
	
	
}
