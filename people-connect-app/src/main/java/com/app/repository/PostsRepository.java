package com.app.repository;

import com.app.model.Posts;
import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends CosmosRepository<Posts,String> {
}
