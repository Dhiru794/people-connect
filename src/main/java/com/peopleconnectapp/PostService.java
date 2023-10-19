package com.peopleconnectapp;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PostService {
    PostRepository postRepository;


    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Posts create(Posts posts){
        Posts posts1 = new Posts(posts.getFirstName(),posts.getLastName(),
                posts.getEmail(),posts.getCategoryId(),posts.getCategoryName()
        ,posts.getDesc(),posts.getIsActive());
        postRepository.save(posts1);
        return posts1;
    }

    public List<Posts> getAllPosts(String categoryName){
        List<Posts>  posts;
        String isActive = "Y";
        if(Objects.equals(categoryName, "")){
            posts = postRepository.findByIsActive(isActive);
        }else{
            posts = postRepository.findByCategoryNameAndIsActive(categoryName,isActive);
        }
        return posts;
    }
}
