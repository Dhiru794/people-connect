package com.peopleconnectapp.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.peopleconnectapp.model.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CosmosRepository<Category, String> {

}
