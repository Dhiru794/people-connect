package com.peopleconnectapp.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.peopleconnectapp.model.Posts;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CosmosRepository<Posts, String> {
  public List<Posts> findByCategoryNameAndIsActive(String categoryName,String isActive);
  public List<Posts> findByIsActive(String isActive);

}
