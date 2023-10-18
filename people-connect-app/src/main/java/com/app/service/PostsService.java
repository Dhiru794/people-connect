package com.app.service;

import com.app.model.Posts;
import com.app.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostsService {
	
	@Autowired
    private  PostsRepository postsRepository;

	/*
	 * public PostsService() { postsRepository=null; }
	 * 
	 * @Autowired public PostsService(PostsRepository postsRepository) {
	 * this.postsRepository = postsRepository; }
	 */
    public Posts createPost(Posts posts){
       Posts newPost = new Posts(posts.getName(),posts.getEmail(),
               posts.getPhone_no(),posts.getDesc(),posts.getIsActive());
       postsRepository.save(newPost);
       return newPost;
    }
}
