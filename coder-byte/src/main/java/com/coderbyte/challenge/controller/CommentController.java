package com.coderbyte.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderbyte.challenge.service.CommentService;

/**
 * @author Kashif Rehman
 * Created on 11th Of June,2024.
 * CommentController handles HTTP requests related to comments. It delegates business logic to the CommentService.
 */

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
    private CommentService commentService;

	/**
     * Endpoint to get all comments.
     * 
     * @return ResponseEntity containing the list of comments in JSON format.
     */
    @GetMapping
    public ResponseEntity<String> getAllComments() {
        String response = commentService.getAllComments();
        return ResponseEntity.ok(response);
    }

    /**
     * Endpoint to get comments for a specific post.
     * 
     * @param postId The ID of the post whose comments are to be retrieved.
     * @return ResponseEntity containing the list of comments for the specified post in JSON format.
     */
    @GetMapping("/post/{postId}")
    public ResponseEntity<String> getCommentsByPost(@PathVariable Long postId) {
        String response = commentService.getCommentsByPost(postId);
        return ResponseEntity.ok(response);
    }

}
