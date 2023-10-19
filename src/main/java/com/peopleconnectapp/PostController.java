package com.peopleconnectapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/posts")
public class PostController {
    @Autowired
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }


    // Upsert - create if not exists, update if exists
    @CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Posts> create(@RequestBody Posts posts) {
        Posts saved = postService.create(posts);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping(path = "/getAll",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Posts>> getAllPosts(@RequestParam String categoryName) {
        List<Posts> posts = postService.getAllPosts(categoryName);
        return new ResponseEntity<List<Posts>>(posts, HttpStatus.OK);
    }


}
