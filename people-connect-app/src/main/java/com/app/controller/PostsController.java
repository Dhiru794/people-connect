package com.app.controller;

import com.app.model.Posts;
import com.app.service.PostsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sell")
public class PostsController {

    private final PostsService postsService;

    @Autowired
    public PostsController(PostsService postsService) {
        this.postsService = postsService;
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ResponseEntity<Posts> createPost(@RequestBody Posts posts){
        Posts newPost = postsService.createPost(posts);
        return new ResponseEntity<>(newPost, HttpStatus.CREATED);
    }

    @GetMapping("/getInt")
    public int getInteger(){
        return 1;
    }
}
