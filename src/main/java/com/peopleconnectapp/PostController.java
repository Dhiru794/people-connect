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
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Posts> create(@RequestBody Posts posts) {
        Posts saved = postService.create(posts);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

//    @GetMapping(path = "/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<User> getUserByEmail(@PathVariable("email") String email) {
//
//        System.out.println("searching user " + email);
//
//        Optional<User> maybe = users.findById(email, new PartitionKey(email));
//        return maybe.isPresent() ? new ResponseEntity<User>(maybe.get(), HttpStatus.OK)
//                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
//
//    }
//
    @GetMapping(path = "/getAll",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Posts>> getAllPosts(@RequestParam String categoryName) {
        List<Posts> posts = postService.getAllPosts(categoryName);
        return new ResponseEntity<List<Posts>>(posts, HttpStatus.OK);
    }
//
//    // replace existing item (not upsert)
//    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<User> replace(@RequestBody User user) {
//
//        System.out.println("replacing user " + user.getEmail());
//
//        Optional<User> maybe = users.findById(user.getEmail(), new PartitionKey(user.getEmail()));
//        if (!maybe.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        User saved = users.save(user);
//        return new ResponseEntity<>(saved, HttpStatus.OK);
//    }
//
//    @DeleteMapping(path = "/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<User> deleteUser(@PathVariable("email") String email) {
//
//        System.out.println("deleting user " + email);
//
//        users.deleteById(email, new PartitionKey(email));
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

}
